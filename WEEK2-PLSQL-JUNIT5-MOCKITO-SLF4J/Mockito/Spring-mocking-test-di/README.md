

---

# Spring Mocking Tests

This project demonstrates how to use Mockito for unit testing and integration testing in a Spring Boot application. It includes examples of mocking services, repositories, and full controller-service integration with mock dependencies.

## Project Structure

* `User.java`: Entity class representing a user
* `UserRepository.java`: Spring Data JPA repository interface
* `UserService.java`: Service layer that interacts with the repository
* `UserController.java`: REST controller exposing endpoints to access user data
* `SpringMockingTestsApplication.java`: Main application class annotated with `@SpringBootApplication`

## Test Cases

### 1. Controller Unit Test

* Class: `UserControllerTest`
* Mocks `UserService` to test `UserController` in isolation

### 2. Service Unit Test

* Class: `UserServiceTest`
* Mocks `UserRepository` to test `UserService` logic independently

### 3. Integration Test

* Class: `UserIntegrationTest`
* Uses `@SpringBootTest` and `@MockBean` to test `UserController` with a mocked `UserService`
* Uses `MockMvc` to simulate HTTP requests and assert responses

## Technologies Used

* Spring Boot 3.2.5
* Spring Web
* Spring Data JPA
* H2 Database (runtime only)
* JUnit 5
* Mockito
* MockMvc

## Requirements

* Java 17 or higher
* Maven 3.6 or higher

## How to Run

### To run all tests:

```
mvn test
```

### To run the Spring Boot application:

```
mvn spring-boot:run
```

## Folder Layout

* `src/main/java/com/example`: Application source code
* `src/test/java/com/example`: Unit and integration test classes
* `pom.xml`: Maven configuration file with dependencies and plugins

---

