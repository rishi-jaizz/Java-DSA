import java.util.Scanner;
public class arr_square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[10];
        int sum=0;
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            System.out.print("Square of arr["+i+"] = ");
            arr[i]*=arr[i];
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        System.out.println("Sum of squares is = "+sum);
        sc.close();
    }
}
