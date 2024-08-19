# Simple Factory Pattern

## Overview
The Simple Factory Pattern is a creational design pattern that provides a way to create objects without specifying the exact class of the object that will be created.

## Classes

### ShapeFactory
The `ShapeFactory` class is responsible for creating instances of different shapes based on the provided `ShapeType`.

#### Methods
- `Shape drawShape(ShapeType shapeType)`: This method takes a `ShapeType` as an argument and returns an instance of the corresponding shape.

### Shape
The `Shape` interface defines a method that all concrete shapes must implement.

#### Methods
- `void draw()`: This method is implemented by all concrete shapes to perform the drawing action.

### Circle
The `Circle` class implements the `Shape` interface and provides the implementation for the `draw` method.

### Rectangle
The `Rectangle` class implements the `Shape` interface and provides the implementation for the `draw` method.

### Square
The `Square` class implements the `Shape` interface and provides the implementation for the `draw` method.

## Usage
The `Main` class demonstrates how to use the `ShapeFactory` to create and draw different shapes.

```java
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.drawShape(ShapeType.CIRCLE);
        circle.draw();

        Shape rectangle = shapeFactory.drawShape(ShapeType.RECTANGLE);
        rectangle.draw();

        Shape square = shapeFactory.drawShape(ShapeType.SQUARE);
        square.draw();
    }
}
```

## Advantages of the Simple Factory Pattern

### Extensibility

The Simple Factory Pattern makes it easy to extend the codebase. When you need to add new shapes, you only need to:

1. Create a new class that implements the `Shape` interface.
2. Update the `ShapeType` enum to include the new shape type.
3. Update the `ShapeFactory` to handle the new shape type.

#### Example

Let's say you want to add a new shape called `Triangle`. To do this, you need to:

1. Create a new class called `Triangle` that implements the `Shape` interface.

```java
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}
```

2. Update the `ShapeType` enum to include `TRIANGLE`.

```java
public enum ShapeType {
    CIRCLE,
    RECTANGLE,
    SQUARE,
    TRIANGLE
}
```

3. Update the `ShapeFactory` class to handle the `TRIANGLE` case.

```java
public class ShapeFactory {
	public Shape drawShape (ShapeType shapeType) {
		return switch (shapeType) {
			case CIRCLE -> new Circle();
			case RECTANGLE -> new Rectangle();
			case SQUARE -> new Square();
			case TRIANGLE -> new Triangle();
		};
	}
}
```

### Code Maintenance

By using the Simple Factory Pattern, the code becomes more maintainable. Changes to the object creation process are localized to the factory class, reducing the risk of introducing bugs in other parts of the application.
