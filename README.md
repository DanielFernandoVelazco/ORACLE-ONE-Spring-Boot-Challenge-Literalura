# Backend Java - Desafío Oracle One

## Descripción
Este proyecto es un backend en Java desarrollado como parte del **Desafío Oracle One**. Proporciona una serie de funcionalidades para gestionar y buscar información sobre libros y autores, permitiendo a los usuarios realizar diversas consultas relacionadas con estos datos.

---

## Funcionalidades
El backend ofrece las siguientes opciones:

| Opción | Funcionalidad                                           |
|--------|---------------------------------------------------------|
| 1      | Agregar libro por Nombre                                |
| 2      | Listar libros buscados                                  |
| 3      | Buscar libro por Nombre                                 |
| 4      | Buscar todos los Autores de libros buscados             |
| 5      | Buscar autores por año                                  |
| 6      | Buscar libros por idioma                                |
| 7      | Mostrar el Top 10 de libros más descargados             |
| 8      | Buscar autor por Nombre                                 |
| 0      | Salir del programa                                      |

---

## Requisitos
- **Java 11** o superior
- **Maven** para la gestión de dependencias
- **Base de datos** compatible PostgreSQL

---

## Configuración
1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/DanielFernandoVelazco/ORACLE-ONE-Spring-Boot-Challenge-Literalura.git
   cd ORACLE-ONE-Spring-Boot-Challenge-Literalura
   ```

2. **Configurar la base de datos**:
   - Crear una base de datos para el proyecto.
   - Configurar las credenciales de la base de datos en el archivo `application.properties` (ubicado en `src/main/resources`). Ejemplo:
     
     ```
    spring.datasource.url=jdbc:postgresql://${DB_HOST}/${DB_NAME}?serverTimezone=UTC
    spring.datasource.dbname=${DB_NAME}
    spring.datasource.username=${DB_USER}
    spring.datasource.password=${DB_PASSWORD}
    spring.datasource.driver-class-name=org.postgresql.Driver
    hibernate.dialect=org.hibernate.dialect.HSQLDialect

    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.format-sql=true 
    
    ```

3. **Instalar dependencias**:
   - En el archivo "pom.xml"
   
   ```
   <dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.16.0</version>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>    
      
   ```

4. **Ejecutar la aplicación**:
   ```
   Con la opcione RUN de IntelliJ puede ejecutar la aplicacion.
   ```

---

## Endpoints disponibles
El backend expone una serie de endpoints REST para cada funcionalidad. A continuación, se describen brevemente:

### 1. Agregar libro por Nombre
- **POST** `/books`
  - **Body**: JSON con los detalles del libro.

### 2. Lista de libros buscados
- **GET** `/books`

### 3. Buscar libro por Nombre
- **GET** `/books/search?name=<nombre>`

### 4. Buscar todos los Autores de libros buscados
- **GET** `/books/authors`

### 5. Buscar autores por año
- **GET** `/authors?year=<año>`

### 6. Buscar libros por idioma
- **GET** `/books?language=<idioma>`

### 7. Top 10 libros más descargados
- **GET** `/books/top10`

### 8. Buscar autor por nombre
- **GET** `/authors/search?name=<nombre>`

---

## Contribuciones
Las contribuciones a este proyecto son bienvenidas. Por favor, crea un **fork** del repositorio y envía un **pull request** con tus propuestas.

---

## Autor
Proyecto desarrollado como parte del **Desafío Oracle One**.

