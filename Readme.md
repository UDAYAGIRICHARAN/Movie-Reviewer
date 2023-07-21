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


## Endpoints

The application provides the following endpoints for user management and authentication:




- **POST /login**: Generate JWT token for authentication.
- Request Body: JwtRequest object containing username and password.
- Response: JwtResponse object containing JWT token.

![image](https://github.com/UDAYAGIRICHARAN/GreenStitch/assets/67089878/3136e202-230c-49c9-b782-2299421c461a)

- **POST /users/signup**: Register a new user.
- Request Body: User object in JSON format.
- Response: Registered user object.


![image](https://github.com/UDAYAGIRICHARAN/GreenStitch/assets/67089878/0f00f3e7-73c7-4839-83cf-0c50abc9e005)




### Created other APIs for the admin features

- **GET /users/{id}**: Retrieve a specific user by ID.
- Path Variable: User ID.
- Response: User object.

- **PUT /users/{id}**: Update an existing user by ID.
- Path Variable: User ID.
- Request Body: Updated user object in JSON format.
- Response: Updated user object.

- **DELETE /users/{id}**: Delete an existing user by ID.
- Path Variable: User ID.
- Response: Success message.

- **GET /users/all**: Retrieve all users.
- Response: List of user objects.



- **GET /users/forAdmin**: Accessible to users with the 'Admin' role only.
- Response: Success message.

- **GET /users/forUser**: Accessible to users with the 'User' role only.
- Response: Success message.

- **POST /createNewRole**: Create a new role.
- Request Body: Role object in JSON format.
- Response: Created role object.



Replace `<JWT_TOKEN>` with the actual JWT token received after successful authentication.

## Configuration

The application's configuration can be found in the `application.properties` file. You can modify the following properties:

- `spring.datasource.url`: JDBC URL for the H2 database.
- `spring.datasource.username`: Database username.
- `spring.datasource.password`: Database password.
- `jwt.secret`: Secret key used for JWT token generation and verification.
- `jwt.expirationMs`: Expiration time for the JWT token in milliseconds.

