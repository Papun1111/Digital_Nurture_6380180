
---

## Strategy Pattern – Payment System

### Overview

This Java application demonstrates the **Strategy Design Pattern** in a payment processing context. The application supports multiple payment methods (such as Credit Card and PayPal), which can be selected and executed at runtime without modifying the client code.

---

### Components

#### 1. **`PaymentStrategy` Interface**

Defines a common interface for all payment strategies.

```java
public interface PaymentStrategy {
    void pay(double amount);
}
```

---

#### 2. **`CreditCardPayment` Class**

Implements `PaymentStrategy` for payments using credit card.

```java
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card: " + cardNumber);
    }
}
```

---

#### 3. **`PayPalPayment` Class**

Implements `PaymentStrategy` for payments using PayPal.

```java
public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal account: " + email);
    }
}
```

---

#### 4. **`PaymentContext` Class**

Acts as the context that uses a `PaymentStrategy` object. It allows dynamic assignment of the payment method.

```java
public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void payAmount(double amount) {
        if (strategy == null) {
            System.out.println("No payment strategy selected.");
            return;
        }
        strategy.pay(amount);
    }
}
```

---

#### 5. **`Main` Class**

Demonstrates how different payment strategies can be selected and executed at runtime.

```java
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy paypal = new PayPalPayment("user@example.com");

        context.setPaymentStrategy(creditCard);
        context.payAmount(1500.00);

        context.setPaymentStrategy(paypal);
        context.payAmount(2500.00);
    }
}
```

---

### Execution Flow

1. The user creates different payment strategies (`CreditCardPayment`, `PayPalPayment`).
2. The context (`PaymentContext`) is assigned a strategy at runtime using `setPaymentStrategy`.
3. The `payAmount` method invokes the selected strategy's `pay` method.

---

### Design Pattern Used

* **Strategy Pattern:** Allows the client to dynamically select and change the payment algorithm at runtime without modifying the context or existing strategies.

---
