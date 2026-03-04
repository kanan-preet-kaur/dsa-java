import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("It is a prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { // n is a multiple of i, where i is neither 1 nor n
                    System.out.println("Not a prime number");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("It is a prime number");
            }
        }
    }
}
