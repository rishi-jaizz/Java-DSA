import java.util.*;
public class syntax_parameter {
    public static int calculateSum(int num1, int num2) {// parameter or formal parameter-definition
        int sum=num1+num2;
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum= calculateSum(a,b);// arguments or actual parameter - function call
        System.out.println("sum is : "+sum);
        sc.close();
    }  
}
