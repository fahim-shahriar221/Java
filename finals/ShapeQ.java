package finals;

abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();
}
class Circle extends Shape {
     double radius;
    // Constructor
     Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
     double width;
     double height;
    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return width * height;
    }
}
public class ShapeQ {
    public static void main(String[] args) {
        // Create a Circle object
        Shape circle = new Circle(5.0); // radius = 5.0
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Create a Rectangle object
        Shape rectangle = new Rectangle(4.0, 6.0); // width = 4.0, height = 6.0
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
