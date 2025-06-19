# AdapterPatternExample

## Overview

This project demonstrates the implementation of the **Adapter Pattern** in Java. The Adapter Pattern allows incompatible interfaces to work together by creating a bridge between the target interface and existing classes. This example simulates a payment processing system that integrates with multiple third-party payment gateways, each using different method signatures.

---

## Project Structure

* **PaymentProcessor.java**
  Defines the target interface expected by the system.

* **StripePaymentGateway.java**
  Represents a third-party payment gateway with its own payment method.

* **PayPalPaymentGateway.java**
  Another third-party gateway using a different method name.

* **StripeAdapter.java**
  Adapts the `StripePaymentGateway` to conform to the `PaymentProcessor` interface.

* **PayPalAdapter.java**
  Adapts the `PayPalPaymentGateway` to conform to the `PaymentProcessor` interface.

* **Main.java**
  Demonstrates how the adapters allow uniform interaction with different payment systems.

---

## Implementation Details

### 1. Target Interface: `PaymentProcessor`

Defines a standard interface for payment processing:

```java
public interface PaymentProcessor {
    void processPayment(double amount);
}
```

### 2. Adaptee Classes

Each third-party payment gateway has its own method:

* `StripePaymentGateway` uses `makeStripePayment(double)`
* `PayPalPaymentGateway` uses `sendPayment(double)`

### 3. Adapter Classes

Each adapter implements `PaymentProcessor` and translates the `processPayment` call to the respective gateway's method:

* `StripeAdapter` wraps `StripePaymentGateway`
* `PayPalAdapter` wraps `PayPalPaymentGateway`

### 4. Testing in `Main`

The `Main` class demonstrates the use of adapters to process payments using different gateways through a consistent interface.

---

## Example Output

```
Processing Payments:
Paid 1500.0 using Stripe.
Paid 3200.5 using PayPal.
```

---

## Purpose

This project shows how to use the Adapter Pattern to:

* Integrate third-party libraries with different APIs
* Maintain a consistent interface (`PaymentProcessor`) across the application
* Simplify integration and increase code flexibility

---

## How to Run

1. Open the project in any Java IDE.
2. Compile and run the `Main.java` class.
3. Observe the output demonstrating unified payment processing through adapters.

---

## Conclusion

The Adapter Pattern is a structural design pattern that promotes reusability and abstraction by allowing existing classes to be used where a different interface is expected. This example clearly illustrates its practical use in real-world application integration scenarios.
