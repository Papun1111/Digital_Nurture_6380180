
---

# ProxyPatternExample

## Overview

This Java project demonstrates the use of the **Proxy Pattern** to simulate image loading with **lazy initialization** and **caching**. The pattern is useful in scenarios where creating an object is resource-intensive and should be deferred until it is actually needed.

---

## Project Structure

### 1. Subject Interface

* **Interface:** `Image`
* **Method:** `void display()`
* **Purpose:** Defines the common interface for both the real image and the proxy.

### 2. Real Subject Class

* **Class:** `RealImage`
* **Implements:** `Image`
* **Function:** Simulates the loading of an image from a remote server and displays it.

### 3. Proxy Class

* **Class:** `ProxyImage`
* **Implements:** `Image`
* **Holds:** A reference to `RealImage`
* **Functionality:**

  * Lazily creates the `RealImage` only when `display()` is first called.
  * Caches the `RealImage` so that subsequent calls do not reload the image.

---

## How It Works

* When a `ProxyImage` is created, no image is loaded initially.
* On the first call to `display()`, the real image is loaded and displayed.
* Subsequent calls to `display()` use the cached `RealImage` without reloading.

---

## Example Test Case

```java
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("server/image1.jpg");

        // Image will be loaded and displayed
        image.display();

        // Image will not be loaded again; cached version will be used
        image.display();
    }
}
```

### Expected Output:

```
Loading image from server/image1.jpg
Displaying image server/image1.jpg
Displaying image server/image1.jpg
```

---

## Conclusion

The Proxy Pattern allows efficient resource management by introducing a stand-in object that controls access to a costly or sensitive resource. In this example, it helps delay image loading until necessary and avoids redundant operations by caching the loaded image. This approach improves performance in systems with expensive object creation or remote data fetching.
