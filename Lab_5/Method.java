package Lab_5;
class Student {
    int age;
    String name, city;

    void insert(String n, String c, int a) {
        name = n;
        city = c;
        age = a;
    }

    void printData() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
}

public class Method {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insert("Fahim Shahriar", "Uttara", 21);
        s2.insert("Sadman Sakib", "Mirpur", 20);
        s1.printData();
        s2.printData();
    }
}
