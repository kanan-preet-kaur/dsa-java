import java.util.Scanner;

/**
 * Demonstrates basic recursion by printing numbers from n to 1 and from 1 to n
 * 
 * <p>
 * Base case: n == 1, stop
 * <p>
 * Recursive case: n to 1: print n, then call for n-1; 1 to n: call for n-1,
 * then print n
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

            if (n <= 0) {
                System.out.println("Invalid input");
                return;
            }

            System.out.print("Numbers from " + n + " to 1: ");
            printNto1(n);
            System.out.print("Numbers from 1 to " + n + ": ");
            print1toN(n);

        }
    }

    /**
     * Recursively prints numbers from n to 1
     * 
     * @param n the starting number, must be >=1
     */
    public static void printNto1(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        printNto1(n - 1);

    }

    /**
     * Recursively prints numbers from 1 to n
     * 
     * @param n the last number to be printed, must be >=1
     */
    public static void print1toN(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }

        print1toN(n - 1);
        System.out.print(n + " ");

    }
}