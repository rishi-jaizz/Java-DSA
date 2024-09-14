package OOPS;

public class Inheritance1 {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}
//Base class
class Animal{
    String Color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Derived Class/subclass
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}

