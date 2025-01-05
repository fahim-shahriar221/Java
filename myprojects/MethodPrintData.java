package com.myprojects;
class Student{
    String  name;
    String city;
    int age;
    Student(String n, String c, int a){
        name=n;
        city=c;
        age=a;
    }
    void printData(){
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("Age: "+age);
    }
}
public class MethodPrintData{
    public static void main(String[] args) {
        Student s1=new Student("Fahim Shahriar", "Uttara", 21);
        Student s2=new Student("Sadman Sakib", "Mirpur", 20);
        s1.printData();
        s2.printData();
    }
}