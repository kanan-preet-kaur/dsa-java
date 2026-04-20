import java.util.Scanner;

public class FastExponentiation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the base: ");
            int a = sc.nextInt();
            System.out.print("Enter the exponent: ");
            int n = sc.nextInt();
            int result = fastExpo(a, n);
            System.out.println(a + " raised to power " + n + ": " + result);
        }
    }

    /**
     * returns {@code a} raised to power {@code n} in O(log n) time complexity.
     * 
     * @param a the base integer
     * @param n the exponent integer
     * @return {@code a} raised to power {@code n}
     */
    public static int fastExpo(int a, int n) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) { // checks LSB
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
}
