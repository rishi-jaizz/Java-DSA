public class overloading_using_datatypes {
    // func to cal int sum 
    public static int sum(int a, int b){
        return a+b;
    }
    // func to cal float sum 
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,3));
        System.out.println(sum(3.2f,4.8f));
    } 
}
