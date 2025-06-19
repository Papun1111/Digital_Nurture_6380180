# BuilderPatternExample

## Overview

This project demonstrates the implementation of the **Builder Pattern** in Java. It is designed to construct complex objects—in this case, a `Computer`—by separating the construction process from the representation. This approach allows for flexible and readable object creation, especially when dealing with optional or varying parameters.

---

## Project Structure

* **Computer.java**
  Contains the `Computer` class and its static nested `Builder` class.

* **Main.java**
  Serves as the test class that creates different configurations of the `Computer` object using the builder.

---

## Features Implemented

### 1. Product Class: `Computer`

* Attributes: `CPU`, `RAM`, `Storage`
* Constructor is private and accepts a `Builder` object
* Getter methods for each attribute

### 2. Builder Class: `Computer.Builder`

* Static nested class
* Methods to set individual attributes: `setCPU()`, `setRAM()`, `setStorage()`
* Method `build()` that returns a new instance of `Computer`

### 3. Builder Pattern Implementation

* Uses method chaining for a fluent interface
* Separates construction logic from the main class
* Allows creation of immutable `Computer` objects with various configurations

---

## Example Usage

```java
public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setCPU("OCTACORE Intel")
                .setRAM("8GB")
                .setStorage("1TB HDD")
                .build();

        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + computer.getCPU());
        System.out.println("RAM: " + computer.getRAM());
        System.out.println("Storage: " + computer.getStorage());
    }
}
```

---

## Output

```
Computer Configuration:
CPU: OCTACORE Intel
RAM: 8GB
Storage: 1TB HDD
```

---

## Purpose

This exercise demonstrates how to:

* Create a builder for objects with multiple optional or required parameters
* Avoid complex constructors or telescoping constructor patterns
* Improve code readability and maintainability through fluent design

---

## How to Run

1. Clone or download the project into your Java IDE.
2. Compile and run the `Main` class.
3. Observe how different configurations of `Computer` can be created easily using the builder.

---

## Conclusion

The Builder Pattern is a powerful design pattern for managing the creation of complex objects in a clear and flexible way. This project showcases how to implement it in Java for real-world use cases.
