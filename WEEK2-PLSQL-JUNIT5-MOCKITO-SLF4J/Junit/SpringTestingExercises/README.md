
---

# Spring Testing Exercises

This project includes a set of exercises demonstrating unit testing, integration testing, controller testing, exception handling, and parameterized testing using Spring Boot, JUnit 5, and Mockito.

## Project Structure

* `CalculatorService.java`: Simple service to add two numbers
* `User.java`: Entity class for user data
* `UserRepository.java`: Repository interface extending JpaRepository
* `UserService.java`: Service layer handling user-related operations
* `UserController.java`: REST controller with endpoints for user operations
* `GlobalExceptionHandler.java`: Handles application-wide exceptions

## Test Coverage

* Unit test for basic service method
* Mocked repository in service layer test
* Controller test using MockMvc
* Integration test for controller-service-repository flow
* POST endpoint test
* Exception handling test in service and controller layers
* Parameterized unit test with multiple inputs
* Custom repository query test

## Requirements

* Java 17 or higher
* Maven 3.6 or higher
* Spring Boot 3.2.5

## Setup and Execution

1. Unzip the project
2. Navigate to the project directory
3. Run the tests using Maven

```
mvn test
```

To run the Spring Boot application:

```
mvn spring-boot:run
```

## Tools and Frameworks

* Spring Boot
* Spring Data JPA
* H2 Database
* JUnit 5
* Mockito
* MockMvc

---
