
---

# Sorting Customer Orders

## Scenario

In an e-commerce platform, prioritising high-value orders is crucial for revenue optimisation and resource allocation. This exercise focuses on sorting customer orders by their `totalPrice` to ensure that the highest-value orders are processed first.

---

## 1. Understanding Sorting Algorithms

### Bubble Sort

A simple comparison-based algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. Suitable for small datasets.

* **Best Case Time Complexity:** O(n)
* **Average and Worst Case:** O(n²)
* **Space Complexity:** O(1)

### Insertion Sort

Builds the sorted array one item at a time by inserting each element into its proper place. Efficient for nearly sorted arrays.

* **Best Case Time Complexity:** O(n)
* **Worst Case:** O(n²)
* **Space Complexity:** O(1)

### Quick Sort

A divide-and-conquer algorithm. It selects a pivot, partitions the array around the pivot, and recursively sorts the subarrays.

* **Best and Average Case Time Complexity:** O(n log n)
* **Worst Case:** O(n²) (rare with good pivot selection)
* **Space Complexity:** O(log n) for recursive stack

### Merge Sort

Another divide-and-conquer algorithm. It splits the array in half, sorts each half, and merges them.

* **Time Complexity:** O(n log n) in all cases
* **Space Complexity:** O(n)

---

## 2. Setup

A class `Orders` is created with the following attributes:

* `orderId` (int)
* `customerName` (String)
* `totalPrice` (double)

---

## 3. Implementation

* **Bubble Sort:** Sorts the array of orders in ascending order of `totalPrice` using the basic comparison and swap method.
* **Quick Sort:** Sorts the array of orders in ascending order of `totalPrice` using pivot-based recursive partitioning.

---

## 4. Analysis

### Performance Comparison

| Algorithm   | Best Case  | Average Case | Worst Case | Space    |
| ----------- | ---------- | ------------ | ---------- | -------- |
| Bubble Sort | O(n)       | O(n²)        | O(n²)      | O(1)     |
| Quick Sort  | O(n log n) | O(n log n)   | O(n²)      | O(log n) |

### Why Quick Sort is Preferred

Quick Sort is generally preferred over Bubble Sort due to its significantly better average-case performance. While Bubble Sort is easier to implement, it becomes inefficient for larger datasets. Quick Sort, with a good pivot strategy, performs faster and is suitable for real-time systems and large-scale data sorting.

---

