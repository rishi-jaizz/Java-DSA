import java.util.*;

public class Condition {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int age = 16;
        if(age>=18){
            System.out.println("vote, drive");
        }
        if(age > 13 && age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("No Adult");
        }
        sc.close();
    }
}