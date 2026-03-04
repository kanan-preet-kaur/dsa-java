import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        int flag = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not a prime number");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("It is a prime number");
        }
    }
}
