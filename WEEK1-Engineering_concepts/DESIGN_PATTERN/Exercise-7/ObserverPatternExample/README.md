
---

## Observer Pattern – Stock Market Monitoring Application

### Overview

This Java application demonstrates the implementation of the **Observer Design Pattern**. The system simulates a stock market where multiple client applications (observers) are notified whenever there is an update. The `StockMarket` class acts as the subject, while `MobileApp` and `WebApp` represent observer clients.

---

### Components

#### 1. **`Observer` Interface**

Defines a standard `update()` method to be implemented by all observers.

```java
interface Observer {
    void update();
}
```

#### 2. **`Stock` Interface**

Represents the Subject in the Observer pattern. It provides methods to register, deregister, and notify observers.

```java
interface Stock {
    void register(Observer obj);
    void deregister(Observer obj);
    void notifyObserver();
}
```

#### 3. **`StockMarket` Class**

Implements the `Stock` interface and maintains a list of observers. It notifies all registered observers through the `notifyObserver()` method.

```java
import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    List<Observer> observer = new ArrayList<>();

    @Override
    public void deregister(Observer obj) {
        this.observer.remove(obj);
    }

    @Override
    public void notifyObserver() {
        for (Observer i : this.observer) {
            i.update();
        }
    }

    @Override
    public void register(Observer obj) {
        this.observer.add(obj);
    }
}
```

#### 4. **`MobileApp` Class**

Implements the `Observer` interface and defines the response upon receiving a stock update.

```java
public class MobileApp implements Observer {
    @Override
    public void update() {
        System.out.println("Stocked is updated in yout mobile app");
    }
}
```

#### 5. **`WebApp` Class**

Also implements the `Observer` interface with its own update logic.

```java
public class WebApp implements Observer {
    @Override
    public void update() {
        System.out.println("Stocked is updated in yout Web app");
    }
}
```

#### 6. **`Main` Class**

Demonstrates the registration and notification process of observers.

```java
public class Main {
    public static void main(String[] args) {
        Stock market = new StockMarket();
        Observer obj = new MobileApp();
        Observer obj2 = new WebApp();
        market.register(obj);
        market.register(obj2);
        market.notifyObserver();
    }
}
```

---

### Execution Flow

1. The `Main` class creates a `StockMarket` instance.
2. Two observers, `MobileApp` and `WebApp`, are registered.
3. The `notifyObserver()` method is called, which triggers the `update()` method in both observers.

---

### Pattern Used

* **Observer Pattern:** Allows loose coupling between the subject (`StockMarket`) and its observers (`MobileApp`, `WebApp`), enabling dynamic registration and real-time updates.

---


