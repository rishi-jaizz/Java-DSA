package OOPS;

public class typeconstruct {
    public static void main(String[] args) {
//        Students s1 = new Students("Rishi");
//        System.out.println(s1.name);
          Student1 s1 = new Student1();
          Student1 s2 = new Student1("Rishi");
          Student1 s3 = new Student1(123);
          System.out.println(s1);
          System.out.println(s2.name);
          System.out.println(s3.roll);

    }
}

class Student1{
    String name;
    int roll;

    Student1() {
        System.out.println("Constructor is called..."); //agar hum value nhi pas karna chahte tb simple print kardenge
        //        this.name = name;
    }
    Student1(String name){
        this.name= name;
    }
    Student1(int roll){
        this.roll=roll;
    }
}


