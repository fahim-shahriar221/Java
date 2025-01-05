package finals;
abstract class Shape1 {
    abstract void CalculateArea();
}
class Circle1 extends Shape1{
    @Override
    void CalculateArea() {
        float radius =5;
        float area= (float) (3.1416*radius*radius);
        System.out.println("Area of the circle is : "+area);
    }
}
class Rectangle1 extends Shape1{
    void CalculateArea() {
        float width = 5;
        float length = 10; // To make it a square by default
        float area = width * length;
        System.out.println("Area of the square is: " + area);
    }
}
public class Main {
    public static void main(String[] args) {
        Shape1 c=new Circle1();
        Shape1 r=new Rectangle1();
        c.CalculateArea();
        r.CalculateArea();
    }
}