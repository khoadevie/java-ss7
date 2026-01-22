// class animal
public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

// class cat
public class Cat extends Animal {
    private String breed;

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Cat is barking (theo đề bài)");
    }
}

// class dog
public class Dog extends Animal {
    private String color;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void meow() {
        System.out.println("Dog is meowing (theo đề bài)");
    }
}

// main.java
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Mimi", 2, "British Shorthair");
        Dog dog = new Dog("Buddy", 3, "Brown");

        cat.makeSound();
        cat.bark();

        dog.makeSound();
        dog.meow();
    }
}
