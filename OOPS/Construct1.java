package OOPS;

public class Construct1 {
    public static void main(String[] args) {
//        Students s1 = new Students("Rishi");
//        System.out.println(s1.name);
          Students s1 = new Students();
          System.out.println(s1);

    }
}

class Students {
    String name;
    int roll;

    Students() {
//        this.name = name;
        System.out.println("Constructor is called..."); //agar hum value nhi pas karna chahte tb simple print kardenge
    }
}

