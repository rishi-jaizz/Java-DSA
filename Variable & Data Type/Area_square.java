import java.util.*;

public class Area_square {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println(area);
        sc.close();
    }   
}
