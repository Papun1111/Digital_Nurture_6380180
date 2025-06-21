
---

## Dependency Injection – Customer Management Application

### Overview

This Java application demonstrates the use of **constructor-based Dependency Injection** to manage dependencies between a service class and a repository. The system simulates a basic customer management application where `CustomerService` depends on a `CustomerRepository` to retrieve customer data.

---

### Components

#### 1. **Customer.java**

Represents a simple domain object with attributes for customer ID and name.

```java
public class Customer {
    private String id;
    private String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
```

---

#### 2. **CustomerRepository.java**

Defines an interface for customer data access operations.

```java
public interface CustomerRepository {
    Customer findCustomerById(String id);
}
```

---

#### 3. **CustomerRepositoryImpl.java**

Implements the `CustomerRepository` interface using a hardcoded map to simulate a data source.

```java
import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customers = new HashMap<>();

    public CustomerRepositoryImpl() {
        customers.put("101", new Customer("101", "Alice"));
        customers.put("102", new Customer("102", "Bob"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customers.get(id);
    }
}
```

---

#### 4. **CustomerService.java**

The service layer that depends on the `CustomerRepository` to retrieve and display customer data. Dependency is injected through the constructor.

```java
public class CustomerService {
    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void displayCustomer(String id) {
        Customer customer = repository.findCustomerById(id);
        if (customer != null) {
            System.out.println("Customer ID: " + customer.getId());
            System.out.println("Customer Name: " + customer.getName());
        } else {
            System.out.println("Customer not found.");
        }
    }
}
```

---

#### 5. **Main.java**

Initialises the repository and service, and demonstrates usage through method calls.

```java
public class Main {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        service.displayCustomer("101");
        service.displayCustomer("999");
    }
}
```

---

### Execution Flow

1. `CustomerRepositoryImpl` is created with sample customer data.
2. `CustomerService` receives `CustomerRepository` as a dependency through its constructor.
3. `Main` invokes the service to display customer information based on ID lookup.

---

### Design Principle Used

* **Dependency Injection**: Decouples object creation from usage by injecting required dependencies through the constructor, improving modularity, testability, and maintainability.

---
