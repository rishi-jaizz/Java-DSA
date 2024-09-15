public class product {
    public static int calculateProduct(int a,int b){
        int product =a*b;
        return product; 
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int prod=calculateProduct(a,b);
        System.out.println("a * b : "+prod);
    } 
}
