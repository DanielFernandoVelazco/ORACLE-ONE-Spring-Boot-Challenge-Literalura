package com.literatura.challenge_2_book;
import com.literatura.challenge_2_book.Libreria.Libreria;
import com.literatura.challenge_2_book.repository.iAutorRepository;
import com.literatura.challenge_2_book.repository.iLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Challenge2Books implements CommandLineRunner {

	@Autowired
	private iLibroRepository libroRepository;
	@Autowired
	private iAutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(Challenge2Books.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Libreria libreria = new Libreria(libroRepository, autorRepository);
		libreria.consumo();
	}
}
