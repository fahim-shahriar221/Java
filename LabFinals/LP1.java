package LabFinals;

/* Create a base class Animal with attributes like name and sound (optional). Define methods
like eat() and makeSound(). Derive subclasses like Dog, Cat, and Bird that inherit from Animal,
overriding makeSound() and potentially adding specific attributes and methods.
Test your code by creating instances of these classes and calling their methods.
*/

class Animal {
    String name;
    String sound;
    // Constructor
    Animal(String name) {
        this.name = name;
    }
    // Method for eating
    void eat() {
        System.out.println(name + " is eating.");
    }
    // Method for making a sound
    void makeSound() {
        System.out.println(name + " makes a sound: " + sound);
    }
}
// Dog class
class Dog extends Animal {
    Dog(String name) {
        super(name);
        this.sound = "Bark";
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: " + sound);
    }
}
// Cat class
class Cat extends Animal {
    Cat(String name) {
        super(name);
        this.sound = "Meow";
    }
    @Override
     void makeSound() {
        System.out.println(name + " says: " + sound);
    }
}
// Bird class
class Bird extends Animal {
     Bird(String name) {
        super(name);
        this.sound = "Chirp";
    }

    @Override
     void makeSound() {
        System.out.println(name + " says: " + sound);
    }
}

// Main class to test
public class LP1 {
    public static void main(String[] args) {
        // Create instances of each subclass
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        Animal bird = new Bird("Tweety");

        // Call methods
        dog.eat();
        dog.makeSound();
        System.out.println();
        cat.eat();
        cat.makeSound();
        System.out.println();
        bird.eat();
        bird.makeSound();
    }
}


