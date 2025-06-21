
---

## Command Pattern – Home Automation System

### Overview

This project demonstrates the use of the **Command Design Pattern** to build a home automation system where devices such as lights can be controlled using encapsulated command objects. The pattern decouples the sender of a request from its receiver, allowing greater flexibility and extensibility.

---

### Components

#### 1. **`Command` Interface**

Defines a common method `execute()` that all concrete commands must implement.

```java
public interface Command {
    void execute();
}
```

---

#### 2. **`Light` Class (Receiver)**

Represents the device that performs the actual operations. It contains methods to turn the light on and off.

```java
public class Light {
    public void turnOn() {
        System.out.println("The light is ON.");
    }

    public void turnOff() {
        System.out.println("The light is OFF.");
    }
}
```

---

#### 3. **`LightOnCommand` Class**

Implements the `Command` interface and defines the action for turning on the light.

```java
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
```

---

#### 4. **`LightOffCommand` Class**

Implements the `Command` interface and defines the action for turning off the light.

```java
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
```

---

#### 5. **`RemoteControl` Class (Invoker)**

Holds a reference to a `Command` object and executes it when the button is pressed.

```java
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command assigned.");
        }
    }
}
```

---

#### 6. **`Main` Class**

Demonstrates how to issue commands through the remote control to control the light.

```java
public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
```

---

### Execution Flow

1. The `Light` object acts as the receiver with on/off functionality.
2. `LightOnCommand` and `LightOffCommand` encapsulate the actions to be performed.
3. `RemoteControl` serves as the invoker that triggers commands.
4. The client assigns commands to the remote and executes them by pressing the button.

---

### Design Pattern Used

* **Command Pattern**: Encapsulates a request as an object, thereby allowing for parameterization, queuing, and logging of requests. It enables decoupling between sender and receiver.

---


