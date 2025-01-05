package finals;
// 1.b Given the following class definitions  create an instance of the subclass and call its inherited method
class Vehicle{
    void start(){
        System.out.println("Vehicle Started");
    }
}
class Car extends Vehicle{
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
    }
}