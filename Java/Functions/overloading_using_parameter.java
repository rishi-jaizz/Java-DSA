public class overloading_using_parameter {
    // func to cal sum of 2 nums
    public static int sum(int a, int b){
        return a+b;
    }
    // func to cal sum of 3 nums
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,3));
        System.out.println(sum(5,2,1));
    } 
}
