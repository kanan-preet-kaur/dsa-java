import java.util.Scanner;

/**
 * Demonstrates basic recursion by printing numbers from n to 1
 * 
 * <p>
 * Base case: n == 0, stop
 * <p>
 * Recursive case: print n, then call for n-1
 * 
 * <p>
 * Time Complexity: O(n), one call per number
 * <p>
 * Space Complexity: O(n), n frames on the call stack
 */
public class PrintNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            printNto1(n);
        }
    }

    /**
     * Recursively prints numbers from n to 1
     * 
     * @param n the starting number, must be >=0
     */
    public static void printNto1(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printNto1(n - 1);
    }
}