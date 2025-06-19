
---

# Singleton Pattern Example – Logger Utility

## Overview

This project demonstrates the implementation of the Singleton Design Pattern in Java. The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it. This is particularly useful for utility classes such as logging, where consistent behaviour and shared state across an application are required.

## Exercise Scenario

You are required to implement a logging utility class that ensures only one instance exists during the entire application lifecycle. This allows consistent and centralised logging without the risk of creating multiple logger instances.

## Project Structure

**Project Name:** `SingletonPatternExample`

### Files:

1. **Logger.java**
   This class follows the Singleton Design Pattern. It contains:

   * A private static instance of itself
   * A private constructor to restrict instantiation from outside the class
   * A public static method `getObj()` that returns the single instance

2. **Main.java**
   This class tests the Singleton implementation by:

   * Accessing the logger instance multiple times
   * Printing their hash codes to verify that the same instance is returned

## Implementation Summary

* The `Logger` class uses lazy initialization, where the object is created only when it is needed.
* The static method `getObj()` ensures only one instance is created, even if called multiple times.
* The `Main` class demonstrates that repeated calls to `Logger.getObj()` return the same object by comparing hash codes.

## Sample Output

```
Hash Code:12345678
Hash Code:12345678
true
```

This confirms that both references point to the same object, proving that the Singleton Pattern is implemented correctly.

## Key Takeaways

* Singleton Pattern is ideal for classes that should have a single shared instance.
* Useful in scenarios like configuration management, logging, caching, and thread pools.
* Care should be taken in multi-threaded environments to ensure thread safety.

---

