class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cow extends Animal {

    void sound() {
        System.out.println("Cow is making a sound");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Dog d = new Dog();
        Cow c = new Cow();

        d.eat();
        d.bark();

        c.eat();
        c.sound();
    }
}
