import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
