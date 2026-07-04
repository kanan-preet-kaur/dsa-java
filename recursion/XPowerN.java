import java.util.Scanner;

public class XPowerN {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the base: ");
            int x = sc.nextInt();
            System.out.print("Enter the power: ");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Invalid Input!");
                return;
            }
            // int result = calcPower(x, n);
            int result = power(x, n);
            System.out.println(x + " raised to power " + n + ": " + result);
        }
    }

    /**
     * Recursively calculates a number x, raised to power n
     * 
     * <p>
     * Time Complexity: O(n), one call per unit of power
     * <p>
     * Space Complexity: O(n), one call frame per unit of power in the call stack
     * 
     * @param x The base which is raised to a power
     * @param n The power of the base
     * 
     * @return x raised to power n
     */
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * calcPower(x, n - 1);
    }

    /**
     * OPTIMIZED APPROACH
     * Recursively calculates a number x, raised to power n in log n time complexity
     * 
     * <p>
     * Time Complexity: O(log n), n is halved at each level
     * <p>
     * Space Complexity: O(log n), log n calls in the call stack
     * 
     * @param x The base which is raised to a power
     * @param n The power of the base
     * 
     * @return x raised to power n
     */

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = power(x, n / 2);
        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return x * halfPower * halfPower;
        }
    }
}