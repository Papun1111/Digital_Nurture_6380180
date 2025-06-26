# Mockito Exercises Maven Project

This project contains seven exercises demonstrating how to use Mockito and JUnit 5 for unit testing in Java.

## Project Structure

- `src/main/java/com/example/ExternalApi.java`: Interface representing an external API.
- `src/main/java/com/example/MyService.java`: Service class that depends on `ExternalApi`.

### Test Files

Each test class corresponds to a specific exercise:

1. `Exercise1_MockingAndStubbingTest.java`: Demonstrates mocking and stubbing return values.
2. `Exercise2_VerifyingInteractionsTest.java`: Verifies if a method was called.
3. `Exercise3_ArgumentMatchingTest.java`: Uses argument matchers to verify method arguments.
4. `Exercise4_HandleVoidMethodTest.java`: Stubs and verifies a void method.
5. `Exercise5_MultipleReturnsTest.java`: Mocks multiple return values on consecutive calls.
6. `Exercise6_VerifyInteractionOrderTest.java`: Verifies method invocation order.
7. `Exercise7_VoidMethodExceptionTest.java`: Stubs a void method to throw an exception.

## Prerequisites

- Java 11 or higher
- Maven

## Build and Run Tests

Navigate to the project root directory and run: mvn test


This will compile the project and execute all test cases.

## Dependencies

Dependencies are defined in the `pom.xml`:

- `junit-jupiter`: JUnit 5 for testing
- `mockito-core`: For mocking and verifying interactions


