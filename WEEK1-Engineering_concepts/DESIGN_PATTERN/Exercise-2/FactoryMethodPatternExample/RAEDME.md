
---

# Factory Method Pattern Example – Document Management System

## Overview

This project demonstrates the **Factory Method Pattern** through a document management system that can create different types of documents such as Word, PDF, and Excel. The pattern allows for the instantiation of document objects without exposing the creation logic to the client and enables adding new document types with minimal code change.

---

## Project Structure

### 1. Interface

**Document.java**

```java
public interface Document {
    void printDocument();
}
```

### 2. Concrete Document Classes

**PdfDocument.java**

```java
public class PdfDocument implements Document {
    public void printDocument() {
        System.out.println("Hello I am printing a PDF document");
    }
}
```

**WordDocument.java**

```java
public class WordDocument implements Document {
    public void printDocument() {
        System.out.println("Hello I am printing a Word document");
    }
}
```

**ExcelDocument.java**

```java
public class ExcelDocument implements Document {
    public void printDocument() {
        System.out.println("Hello I am printing an Excel document");
    }
}
```

---

### 3. Factory Method Implementation

**Abstract Factory**

**DocumentFactory.java**

```java
public abstract class DocumentFactory {
    public abstract Document createDocument();
}
```

**Concrete Factories**

**PdfDocumentFactory.java**

```java
public class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}
```

**WordDocumentFactory.java**

```java
public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}
```

**ExcelDocumentFactory.java**

```java
public class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}
```

---

### 4. Main Class – Testing the Factory Method

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.printDocument();

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();
        word.printDocument();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excel = excelFactory.createDocument();
        excel.printDocument();
    }
}
```

---

## How to Run

1. Create a new Java project named `FactoryMethodPatternExample`.
2. Add all `.java` files in the `src` directory.
3. Compile and run `Main.java`.
4. Observe the document-specific messages printed to the console.

---

## Output

```
Hello I am printing a PDF document
Hello I am printing a Word document
Hello I am printing an Excel document
```

---

