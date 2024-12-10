package com.fernandovelazco.oracle.principal;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);

    public void showMenu(){
        var option = -1;
        while (option !=0){
            var menu = """
                    
                    *********************************************
                    *                   MENU                    *
                    *********************************************
                    *  1 - Buscar libro por titulo              *
                    *  2 - Lista libros registrados             *
                    *  3 - Lista autores registrados            *
                    *  4 - Lista autores en un determinado ano  *
                    *  5 - Lista libros por idioma              *
                    *                                           *
                    *  0 - Salir                                *
                    *********************************************
                    *               Elija Una Opcion            *
                    *********************************************
                    """;

            System.out.println(menu);
            option = teclado.nextInt();
            teclado.nextLine();


            switch (option) {
                case 1:
                    buscarLibroPorTitulo();
                    break;
                /*
                    case 2:
                    listaLibrosRegistrados();
                    break;
                case 3:
                    listaAutoresRegistrados();
                    break;
                case 4:
                    listaAutoresEnUnDeterminadoAno();
                    break;
                case 5:
                    listaLibrosPorIdioma();
                    break;
*/
                case 0:
                    System.out.println("~~~ Cerrando la aplicacion ");;
                    break;

                default:
                    System.out.println("""
                            
                            ### Opcion Invalida ###
                            ### Verifique las opciones nuevamente ###
                            
                            """);

                }
            }
        }

        private void buscarLibroPorTitulo(){
            System.out.println("hola mundo");
        }
    }

