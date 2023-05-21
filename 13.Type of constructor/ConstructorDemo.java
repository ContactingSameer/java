class Rectangle {
    private int length;
    private int width;

    // Default Constructor
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    // Parameterized Constructor 1
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Parameterized Constructor 2
    public Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    // Copy Constructor
    public Rectangle(Rectangle rectangle) {
        this.length = rectangle.length;
        this.width = rectangle.width;
    }

    // Getter methods
    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    // Setter methods
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Method to calculate area
    public int calculateArea() {
        return this.length * this.width;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5, 10);
        Rectangle rectangle3 = new Rectangle(7);
        Rectangle rectangle4 = new Rectangle(rectangle2);

        // Printing the area of the rectangles
        System.out.println("Area of rectangle1: " + rectangle1.calculateArea());
        System.out.println("Area of rectangle2: " + rectangle2.calculateArea());
        System.out.println("Area of rectangle3: " + rectangle3.calculateArea());
        System.out.println("Area of rectangle4: " + rectangle4.calculateArea());
    }
}
