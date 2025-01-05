package com.myprojects;
class Shape{
    void draw(){System.out.println("drawing...");}
}
class Rectangle extends Shape{
    void draw(){System.out.println("drawing rectangle...");}
}
class Circle2 extends Shape{
    void draw(){System.out.println("drawing circle...");}
}
class Triangle extends Shape{
    void draw(){System.out.println("drawing triangle...");}
}
class AbstractClass{
    public static void main(String[] args){
        Shape s;
        s=new Rectangle();
        s.draw();
        s=new Circle2();
        s.draw();
        s=new Triangle();
        s.draw();
    }}

