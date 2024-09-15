public class binomialCoefficient {
    // Method to calculate factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    // Method to calculate binomial coefficient of a number
    public static int binCoeff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n/(fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String[] args) {
        System.out.println(binCoeff(5,2));
    }
    
}
