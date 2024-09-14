import java.util.Scanner;

public class Area_triangle { 
   public static void main (String args[]){
    // float b=4,h =13,area ;  
    // area = ( b*h) / 2 ;
    Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double area = (base * height)/2;                       
        System.out.println("Area of Triangle is: "+area);
        sc.close();  
    }
}  

 