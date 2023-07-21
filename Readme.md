# Movie Reviewer System

## Movie Reviewer System is where users can check the  ratings, do the rating, and see the movie details like trailers and info about updates.

## Technologies Used

- Java
- Spring Boot
- ReactJs
- Spring Security
- MongoDb

- Maven


## Getting Started

To get started with the project, follow these steps:

1. Clone the repository:

   ```
   git clone
   ```
2. Navigate to the project directory:
   ```
   cd movieBackend
   ```
3. Build the project:
   ```
   mvn clean install
   ```
4. Run the application:
```
mvn spring-boot:run
````


## Screenshots



Replace `<JWT_TOKEN>` with the actual JWT token received after successful authentication.

## Configuration

The application's configuration can be found in the `application.properties` file. You can modify the following properties:

- `spring.datasource.url`: JDBC URL for the H2 database.
- `spring.datasource.username`: Database username.
- `spring.datasource.password`: Database password.
- `jwt.secret`: Secret key used for JWT token generation and verification.
- `jwt.expirationMs`: Expiration time for the JWT token in milliseconds.

