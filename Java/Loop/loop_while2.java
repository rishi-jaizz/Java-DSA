package Loop;

import java.util.Scanner;

public class loop_while2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter =1;
        while(counter<=n){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
        sc.close();
    }
}
