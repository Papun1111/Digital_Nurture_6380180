
---

# DecoratorPatternExample

## Overview

This Java project demonstrates the use of the **Decorator Pattern** to build a flexible notification system. The pattern enables dynamic addition of notification channels (e.g., Email, SMS, Slack) without modifying existing code. Each decorator adds its own behaviour on top of the wrapped component, allowing combinations like Email + SMS + Slack notifications.

---

## Project Structure

### 1. Component Interface

* **Interface:** `Notifier`
* **Method:** `void send()`
* **Purpose:** Defines the common contract for all notification types.

### 2. Concrete Component

* **Class:** `EmailNotifier`
* **Implements:** `Notifier`
* **Function:** Basic notification that sends an email.

### 3. Abstract Decorator

* **Class:** `NotifierDecorator`
* **Implements:** `Notifier`
* **Constructor:** Accepts a `Notifier` object.
* **Function:** Acts as a base wrapper that delegates the `send()` call to the wrapped object.

### 4. Concrete Decorators

#### a. `SlackNotifierDecorator`

* **Extends:** `NotifierDecorator`
* **Function:** Adds Slack notification capability after delegating to the wrapped `Notifier`.

#### b. `SMSNotifierDecorator`

* **Extends:** `NotifierDecorator`
* **Function:** Adds SMS notification capability after delegating to the wrapped `Notifier`.

---

## How It Works

Each decorator wraps another `Notifier` and adds its behaviour after calling the wrapped object's `send()` method. This layering forms a chain of responsibilities.

---

## Example Test Case

```java
public class Main {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier();
        Notifier slackDecorator = new SlackNotifierDecorator(baseNotifier);
        Notifier smsDecorator = new SMSNotifierDecorator(slackDecorator);

        smsDecorator.send();
    }
}
```

### Expected Output:

```
Email Notifier sends a notification
Slack Notifier sends a notification
SMS Notifier sends a notification
```

This output demonstrates that notifications are sent through Email, then Slack, then SMS in sequence.

---

## Conclusion

The Decorator Pattern in this example enables scalable and modular extension of notification functionalities. Each new channel can be added as a new decorator without changing existing logic, making the system open to extension and closed to modification.
