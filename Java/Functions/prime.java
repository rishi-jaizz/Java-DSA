public class prime {
    public static boolean isPrime(int n){
        boolean isPrime= true;
        for(int i=2; i<=n-i; i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(12));
    }  
}
