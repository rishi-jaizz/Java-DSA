import java.util.*;

public class gst_cost {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float Total = (pencil + pen + eraser);
        System.out.println(Total); 

        float newTotal = Total + (0.18f * Total);
        System.out.println(newTotal);
        sc.close();
    }
}
