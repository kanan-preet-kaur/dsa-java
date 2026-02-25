
import java.util.*;

public class input {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first name");
        // String input = sc.next();
        // System.out.println(input);

        System.out.println("Enter full name");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("Enter price");
        float price = sc.nextFloat();
        System.out.println(price);
    }
}
