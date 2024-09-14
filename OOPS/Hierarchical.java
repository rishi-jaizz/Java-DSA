package OOPS;

public class Hierarchical {
    public static void main(String[] args) {
       Bird crow = new Bird();
       crow.eat();
       crow.breathe();
    }
}
// Base/parent class
class Animals1{
    String color;
     void eat(){
         System.out.println("eats");
     }

     void breathe(){
         System.out.println("breathes");
     }
}

// Derived class
class Mammals extends Animals1{
    void walk(){
        System.out.println("walks");
    }
}
class Fishs extends Animals1{
    void walk(){
        System.out.println("swim");
    }
}

class Bird extends Animals1{
    void walk(){
        System.out.println("walks");
    }
}
