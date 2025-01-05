package LabFinals;
/*Create an interface Shape with abstract methods for calculating area() and perimeter(). Implement
 this interface in concrete classes like Circle, Rectangle, and Triangle, providing specific
 implementations for the abstract methods based on their respective formulas. Test your code by
 creating instances of these shapes and calling their methods.
 */
// Define the Shape interface
interface ShapeX {
    double area();
    double perimeter();
}
// Circle class
class Circle2 implements ShapeX {
    double radius;
    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
// Rectangle class
class Rectangle2 implements ShapeX {
     double length;
     double width;

    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {
        return length * width;
    }
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
// Triangle class
class Triangle implements ShapeX {
     double a, b, c; // Sides of the triangle
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area() {
        // Using Heron's formula
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public double perimeter() {
        return a + b + c;
    }
}
// Main class to test
public class LP2 {
    public static void main(String[] args) {
        // Create instances of each shape
        ShapeX circle = new Circle2(5);
        ShapeX rectangle = new Rectangle2(4, 6);
        ShapeX triangle = new Triangle(3, 4, 5);

        // Print area and perimeter
        System.out.println("Circle: Area = " + circle.area() + ", Perimeter = " + circle.perimeter());
        System.out.println("Rectangle: Area = " + rectangle.area() + ", Perimeter = " + rectangle.perimeter());
        System.out.println("Triangle: Area = " + triangle.area() + ", Perimeter = " + triangle.perimeter());
    }
}
