import java.util.Scanner;

/**
 * Print nth number in the fibonacci sequence
 */
public class FibonacciNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the position of fibonacci number to be printed: ");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid input!");
                return;
            }
            int result = nthFibNum(n);
            System.out.println("The " + n + "th fibonacci number: " + result);
        }
    }

    /**
     * Recursively calculates nth number in the fibonacci sequence
     * 
     * @param n the number to be calculated in the sequence
     * @return value of nth number in the fibonacci sequence
     */
    public static int nthFibNum(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return nthFibNum(n - 1) + nthFibNum(n - 2);
    }
}
