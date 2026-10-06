class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override // Indicates that this method overrides a method in the parent class
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override // Indicates that this method overrides a method in the parent class
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound(); // Calls Animal's sound()
        a = new Dog();
        a.sound(); // Calls Dog's sound()
        a = new Cat();
        a.sound(); // Calls Cat's sound()
    }
}
 