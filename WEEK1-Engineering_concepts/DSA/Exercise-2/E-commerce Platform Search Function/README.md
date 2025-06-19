
---

# E-commerce Platform Search Function

## 1. Understanding Asymptotic Notation

### Big O Notation

Big O notation is a mathematical representation used to describe the upper bound of an algorithm's runtime or space requirement in terms of the input size. It helps developers and engineers analyse how efficiently an algorithm scales as input size grows.

It is a tool to evaluate the *worst-case* performance and allows comparing different algorithms independent of hardware and language.

### Best, Average, and Worst-Case Scenarios for Search Operations

* **Linear Search**

  * Best Case: **O(1)** (when the element is the first in the list)
  * Average Case: **O(n/2)** → **O(n)**
  * Worst Case: **O(n)** (element at the end or not found)

* **Binary Search**

  * Best Case: **O(1)** (element is in the middle)
  * Average Case: **O(log n)**
  * Worst Case: **O(log n)**
  * Requires the data to be sorted before searching

## 2. Setup

A class named `Product` is created with attributes that are relevant for an e-commerce platform:

* `productId` – A unique identifier for each product.
* `productName` – Name of the product.
* `category` – Product category such as Electronics, Wardrobe, etc.

This allows efficient and meaningful searching based on identifiers.

## 3. Implementation

Two search algorithms are implemented:

### Linear Search

* Scans each element of the array sequentially.
* Returns the product when a match is found.
* Operates on an unsorted array.

### Binary Search

* Operates on a sorted array.
* Uses divide-and-conquer logic to repeatedly halve the search space.
* Compares the middle element to the target `productId`.

The array of `Product` objects is sorted using Java's `Arrays.sort()` method with a comparator based on `productId`.

## 4. Analysis

### Time Complexity

| Algorithm     | Best Case | Average Case | Worst Case |
| ------------- | --------- | ------------ | ---------- |
| Linear Search | O(1)      | O(n)         | O(n)       |
| Binary Search | O(1)      | O(log n)     | O(log n)   |

### Suitability for the E-commerce Platform

* **Linear Search** is simple to implement but becomes inefficient as the dataset grows.
* **Binary Search** is more efficient for large datasets but requires the array to be sorted beforehand.

**Conclusion**:
For an e-commerce platform where performance is critical and the product list can grow significantly, **binary search** is more suitable. With proper indexing or sorting (which is common in production-grade systems), binary search ensures faster search results and better scalability.

## File Summary

The solution includes:

* A `Product` class to represent items.
* Two methods: `linearSearch` and `binarySearch`.
* An implementation that sorts the product list before applying binary search.
* Output results from both searches for comparison.

---