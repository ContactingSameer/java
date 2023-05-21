abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of abstract method
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of abstract method
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // Creating objects of concrete classes
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        // Printing the areas of the shapes
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}
