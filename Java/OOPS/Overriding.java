package OOPS;

public class Overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal3{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal3{
    void eat(){
        System.out.println("eats grass");
    }
}
// Run time polymorphism / dynamic

