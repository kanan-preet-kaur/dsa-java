import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Invalid input!");
                return;
            }
            System.out.println("Factorial of " + num + ": " + fact(num));
        }

    }

    /**
     * Function recursively calculates factorial of a number
     * 
     * <p>
     * Base case: n == 1 or n == 0, stop
     * <p>
     * Recursive case: find factorial of n-1 and multiply with n
     * 
     * <p>
     * Time Complexity: O(n), one call per number
     * <p>
     * Space Complexity: O(n), n call frames
     * 
     * @param n The number whose factorial is to be calculated, must be >=0
     * @return factorial of n
     */
    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}