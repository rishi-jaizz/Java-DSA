public class sumofodd {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of odd number between 0 and 100 is : " + sum);
    }
}    

