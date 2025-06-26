
---

# JUnit Advanced Testing Exercises

This project contains advanced JUnit testing exercises using JUnit 5. It demonstrates parameterized testing, test suites, test execution order, exception testing, and performance testing.

## Project Structure

* `EvenChecker.java`: A simple class to check if a number is even.
* `EvenCheckerTest.java`: Parameterized tests using `@ValueSource`.
* `OrderedTests.java`: Demonstrates test execution order using `@Order`.
* `ExceptionThrower.java`: A class that throws an exception.
* `ExceptionThrowerTest.java`: Tests that the correct exception is thrown.
* `PerformanceTester.java`: Simulates a task with delay.
* `PerformanceTesterTest.java`: Verifies timeout using `assertTimeout`.
* `AllTests.java`: A test suite that combines all the above tests.

## Requirements

* Java 17 or higher
* Maven 3.6 or higher

## Setup and Execution

1. Unzip the project.
2. Open a terminal and navigate to the project root directory.
3. Run the following command to execute the tests:

```
mvn test
```

## Maven Dependencies

JUnit 5 and the JUnit platform suite API dependencies are included in the `pom.xml`.
