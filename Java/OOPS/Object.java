package OOPS;

// import java.util.*;

public class Object {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color=("Yellow");
        System.out.println(p1.color);
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;

    public Student(int i) {
    }

    public Student(String rishi) {
    }

    void calcPercentage(int phy, int chem,int math){
        percentage=(phy+chem+math)/3;
    }
}
