import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.println(isPowerOfTwo(n) ? "The number is a power of 2." : "The number is not a power of 2.");
        }
    }

    /**
     * Checks if {@code n} is a power of 2.
     * <p>
     * Time Complexity: O(1)
     * <p>
     * Space Complexity: O(1)
     * 
     * @param n the number to check
     * @return {@code true} if {@code n} is power of 2 else {@code false}
     */
    public static boolean isPowerOfTwo(int n) {
        if (n > 0) {
            return ((n & (n - 1)) == 0);
        } else {
            return false;
        }
    }
}
