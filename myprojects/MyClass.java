package com.myprojects;

public class MyClass {
    static int x =5;
    static void printX(){
        System.out.println("x="+x);
    }
    void modifyX(){
        x++;
    }

    public static void main(String[] args) {
        MyClass.printX();
        MyClass obj = new MyClass();
        obj.modifyX();
        MyClass.printX();
    }
}
