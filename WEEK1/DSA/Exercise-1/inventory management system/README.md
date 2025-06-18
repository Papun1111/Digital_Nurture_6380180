---

## Inventory Management System – Java

### 1. Understand the Problem

Efficient data structures and algorithms are critical when managing large inventories, as they enable fast access, updates, and deletions of product data. In large-scale systems, where the number of products can grow rapidly, the performance of the system depends on how data is structured and accessed. Using appropriate data structures helps reduce both time and memory complexity. Among the suitable data structures, `HashMap` is ideal for this problem because it provides constant-time complexity on average for key-based operations like insert, update, delete, and search. On the other hand, `ArrayList` is more suitable when maintaining order or iterating over a collection, but it is inefficient for frequent key-based operations due to its linear-time complexity.

### 2. Setup

To begin, create a new Java project in your IDE or editor, such as Visual Studio Code. Inside your project folder, create three files: `Product.java`, `Inventory.java`, and `Main.java`. Open the terminal, navigate to the folder, compile the files using `javac *.java`, and then run the program with `java Main`.

### 3. Implementation

#### Product.java

```java
public class Product {
    private int productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public void setProductName(String name) { this.productName = name; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName + ", Quantity: " + quantity + ", Price: ₹" + price;
    }
}
```

#### Inventory.java

```java
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Integer, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Product p) {
        if (products.containsKey(p.getProductId())) {
            System.out.println("Product already exists.");
        } else {
            products.put(p.getProductId(), p);
            System.out.println("Product added.");
        }
    }

    public void updateProduct(int id, String name, int qty, double price) {
        Product p = products.get(id);
        if (p != null) {
            p.setProductName(name);
            p.setQuantity(qty);
            p.setPrice(price);
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int id) {
        if (products.remove(id) != null) {
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product p : products.values()) {
                System.out.println(p);
            }
        }
    }
}
```

#### Main.java

```java
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 10, 75000));
        inventory.addProduct(new Product(102, "Mouse", 50, 500));
        inventory.addProduct(new Product(103, "Keyboard", 30, 1500));

        inventory.displayProducts();

        inventory.updateProduct(102, "Wireless Mouse", 60, 700);
        inventory.deleteProduct(103);

        inventory.displayProducts();
    }
}
```

### 4. Analysis

The choice of using a `HashMap` as the underlying data structure allows us to achieve average-case constant time complexity for adding, updating, and deleting products using their product IDs. This efficiency is due to the way hashing works internally to map keys to their respective values. For displaying all products, the system must iterate over the entire map, resulting in linear time complexity with respect to the number of products. To further optimise operations, especially under high concurrency or with persistent storage needs, one could use a `ConcurrentHashMap` for thread-safe access or integrate a database management system for better long-term scalability.
