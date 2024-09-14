package OOPS;

public class Hybrid {
    public static void main(String[] args) {

    }
}
// Base/Parent class
class Animals2{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}
//Derived class
class Fish1 extends Animals2{
    void swim(){
        System.out.println("swims");
    }
}
class Bird1 extends Animals2{
    void fly(){
        System.out.println("flys");
    }
}
class Mammal1 extends Animals2{
    void walk() {
        System.out.println("walks");
    }
}

