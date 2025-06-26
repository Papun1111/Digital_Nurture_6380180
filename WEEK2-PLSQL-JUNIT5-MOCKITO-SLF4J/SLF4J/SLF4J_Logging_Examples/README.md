
---

# SLF4J Logging Examples

This project demonstrates how to use **SLF4J** with **Logback** for logging in Java. It includes:

1. Logging error and warning messages
2. Parameterized logging
3. Using different appenders (console and file) via `logback.xml`

---

## Project Structure

```
SLF4J_Logging_Examples/
├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── LoggingExample.java
│       └── resources/
│           └── logback.xml
```

---

## Prerequisites

* Java 8 or above
* Maven 3.x

---

## Execution Steps

1. Unzip the Project:

   ```bash
   unzip SLF4J_Logging_Examples.zip
   cd SLF4J_Logging_Examples
   ```

2. Compile the Code:

   ```bash
   mvn compile
   ```

3. Run the Application:
   (Optional) Add the following plugin to your `pom.xml` inside the `<build><plugins>` section:

   ```xml
   <plugin>
     <groupId>org.codehaus.mojo</groupId>
     <artifactId>exec-maven-plugin</artifactId>
     <version>3.1.0</version>
     <configuration>
       <mainClass>com.example.LoggingExample</mainClass>
     </configuration>
   </plugin>
   ```

   Then run:

   ```bash
   mvn exec:java
   ```

4. Check Outputs:

   * The console will display error, warning, and info messages.
   * A file named `app.log` will be created in the root directory with the same messages.

---

## Key Features

* Error and Warning Logging:

  ```java
  logger.error("This is an error message");
  logger.warn("This is a warning message");
  ```

* Parameterized Logging:

  ```java
  logger.info("User {} has attempted to log in {} times", username, loginAttempts);
  ```

* Multiple Appenders:
  Configured in `logback.xml` to write logs to both console and file output.

---

## License

This is a demonstration project and is free to use under the MIT License.

---

