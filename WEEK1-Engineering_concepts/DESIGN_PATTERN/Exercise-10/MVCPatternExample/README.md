

---

## MVC Pattern – Student Records Management System

### Overview

This Java project demonstrates the use of the **Model-View-Controller (MVC)** design pattern to manage student records. The application separates concerns into three components: `Model` for storing student data, `View` for displaying information, and `Controller` for handling input and updating the view and model.

---

### Components

#### 1. **Student.java** – Model

Represents the student data with attributes for name, ID, and grade. Provides getters and setters for each field.

```java
public class Student {
    private String name;
    private String id;
    private String grade;

    public Student(String name, String id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
```

---

#### 2. **StudentView\.java** – View

Handles the presentation logic. Displays the student details passed from the controller.

```java
public class StudentView {
    public void displayStudentDetails(String name, String id, String grade) {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }
}
```

---

#### 3. **StudentController.java** – Controller

Acts as an intermediary between the model and view. Updates the model based on user input and refreshes the view.

```java
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentId(String id) {
        model.setId(id);
    }

    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    public String getStudentName() {
        return model.getName();
    }

    public String getStudentId() {
        return model.getId();
    }

    public String getStudentGrade() {
        return model.getGrade();
    }

    public void updateView() {
        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
    }
}
```

---

#### 4. **Main.java** – Test Class

Demonstrates the flow of creating a student, modifying details using the controller, and displaying the updated information through the view.

```java
public class Main {
    public static void main(String[] args) {
        Student model = new Student("Alice", "S101", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Bob");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
```

---

### Execution Flow

1. The `Student` object holds the data.
2. The `StudentView` class is responsible for rendering the student data.
3. The `StudentController` modifies the data in the model and instructs the view to update accordingly.
4. The `Main` class initializes all components and simulates usage of the MVC pattern.

---

### Design Pattern Used

* **MVC Pattern**: Separates the application logic into three interconnected components to improve modularity, maintainability, and testability.

---

