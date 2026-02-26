
import java.util.*;

public class area {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float r = sc.nextFloat();
        float area = 3.14f * r * r;
        System.out.println("Area = " + area);
    }
}
