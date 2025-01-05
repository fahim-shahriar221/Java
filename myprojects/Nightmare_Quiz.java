package com.myprojects;
class Circle1 {
    double radius;
    double calculateArea(double r) {
        radius = r;
        return 3.1416 * radius * radius;
    }
    double calculatePerimeter(double x) {
        radius = x;
        return 2 * 3.1416 * radius;
    }
}
class Geometry1 {
    void printCircleDetails(Circle1 circle) {
        System.out.println("Area: " + circle.calculateArea(5));
        System.out.println("Perimeter: " + circle.calculatePerimeter(5));
    }
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        Geometry1 g = new Geometry1();
        g.printCircleDetails(c);
    }
}
