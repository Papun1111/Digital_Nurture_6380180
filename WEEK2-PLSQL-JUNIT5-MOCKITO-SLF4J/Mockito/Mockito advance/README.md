
---

# Mockito Advanced Testing Exercises

This project includes advanced hands-on exercises using Mockito and JUnit 5. It demonstrates how to mock dependencies such as repositories, REST APIs, file I/O, network clients, and handle multiple return values.

## Project Structure

* `Service.java`, `Repository.java`: Service logic and repository interface
* `RestClient.java`, `ApiService.java`: Service logic for REST API integration
* `MyFileReader.java`, `MyFileWriter.java`, `FileService.java`: File I/O abstraction and service logic
* `NetworkClient.java`, `NetworkService.java`: Network interaction abstraction
* Test files:

  * `ServiceTest.java`
  * `ApiServiceTest.java`
  * `FileServiceTest.java`
  * `NetworkServiceTest.java`
  * `MultiReturnServiceTest.java`

## Requirements

* Java 17 or higher
* Maven 3.6 or higher

## Setup and Execution

1. Unzip the project.
2. Open a terminal and navigate to the project directory.
3. Run the following command to execute the tests:

```
mvn test
```

## Maven Dependencies

All necessary dependencies are defined in `pom.xml`, including:

* JUnit Jupiter API and Engine
* Mockito Core
* Maven Surefire Plugin for test execution

---
