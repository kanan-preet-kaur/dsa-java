import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (n < 1) {
                System.out.println("Invalid input!");
                return;
            }

            int sum = calcSum(n);
            System.out.println("Sum of first " + n + " natural numbers: " + sum);

        }
    }

    /**
     * Recursively calculates the sum of first n natural numbers
     * 
     * <p>
     * Base case: n == 1, stop
     * <p>
     * Recursive case: calculate sum of n-1, add n
     * <p>
     * 
     * Time Complexity: O(n), one call per number
     * <p>
     * Space Complexity: O(n), n call frames
     * 
     * @param n the number up to which the sum is to be calculated
     * @return sum of n natural numbers
     */
    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calcSum(n - 1);
    }
}
