package Apna_College.Pattern;

public class half_pyramid {
    public static void main(String[] args) {
        int n =4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
// 1
// 12
// 123
// 1234