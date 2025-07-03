# Library Management Spring Framework Exercises

This repository provides complete solutions for three foundational exercises to learn and apply core features of the Spring Framework, including dependency injection and Aspect‑Oriented Programming (AOP). Each exercise includes configuration files, source code, and example outputs.

## Contents

* **Exercise 1: Configuring a Basic Spring Application**

  * Maven project setup with Spring Core dependencies
  * `applicationContext.xml` defining `BookService` and `BookRepository` beans
  * Plain Java classes in packages:

    * `com.library.service.BookService`
    * `com.library.repository.BookRepository`
  * Main application class to load the Spring context and invoke service methods, demonstrating basic bean retrieval.

* **Exercise 2: Implementing Dependency Injection**

  * Enhanced `applicationContext.xml` wiring `BookRepository` into `BookService` via setter injection
  * Updated `BookService` class with a public setter for `BookRepository`
  * Main class execution verifying that `BookService` methods operate correctly with the injected repository.

* **Exercise 3: Implementing Logging with Spring AOP**

  * Added `spring-aop` dependency in `pom.xml`
  * Created `com.library.aspect.LoggingAspect` annotated with `@Aspect` to log method execution times
  * Enabled AspectJ support with `<aop:aspectj-autoproxy/>` in `applicationContext.xml`
  * Main application class demonstrating console log messages showing execution durations for service methods.

## Prerequisites

* Java Development Kit (JDK) 17 or later
* Apache Maven 3.6+

## How to Run

1. **Clone the repository**

   ```bash
   git clone <repository_url>
   cd LibraryManagement
   ```

2. **Build the project**

   ```bash
   mvn clean compile
   ```

3. **Execute the application**

   ```bash
   mvn exec:java -Dexec.mainClass="com.librarymanagement.App"
   ```

   * This will load the Spring context, invoke `BookService` and `BookRepository` methods, and display sample outputs.
   * In Exercise 3, you will also see AOP log statements such as:

     ```text
     execution(* com.librarymanagement.service.*.*(..)) executed in 12ms
     ```

## Expected Output

Running the main application should produce output similar to:

```text
[BookService] demoBookService invoked
[BookRepository] demoRepo invoked
Dependency injection verified: bookRepository is not null
[LoggingAspect] com.librarymanagement.service.BookService.demobookservice executed in 15ms
[LoggingAspect] com.librarymanagement.repository.BookRepository.demoRepo executed in 5ms
```

## Exercises 4-8: Common Configuration and Output

Exercises 4, 5, 7, and 8 share the same solution configuration and expected outputs as described in Exercises 1–3. Therefore, their detailed solutions are not repeated here. You can find all necessary configuration files and outputs in the `src/main/java` and `src/main/resources` directories, following the patterns established in earlier exercises.

## Notes

* All source files are located under `src/main/java` following standard Maven conventions.
* Configuration files are in `src/main/resources`.
* You can modify bean IDs, package names, or aspect pointcuts by updating `applicationContext.xml` and your aspect class as needed.

---

