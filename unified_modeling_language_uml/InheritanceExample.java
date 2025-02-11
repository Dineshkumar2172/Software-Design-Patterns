package unified_modeling_language_uml;

class Animal {
    public void eat(){
        System.out.println("The animal is eating");
    }
}

class Dog extends Animal {
    public void bark(){
        System.out.println("The dog is barking");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Inheritance: Represents an "is-a" relationship, where a subclass inherits from a superclass.
        //
        // Inheritance defines an "is-a" relationship where a subclass inherits properties and behaviours (methods) from a superclass.
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
