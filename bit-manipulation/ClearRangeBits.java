import java.util.Scanner;

public class ClearRangeBits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.print("Enter the starting number of bits to be cleared: ");
            int start = sc.nextInt();
            System.out.print("Enter the ending number of bits to be cleared: ");
            int end = sc.nextInt();
            if (start < 0 || start > 31 || end < 0 || end > 31 || start > end) {
                System.out.println("Bits must be between 0 and 31. Start must be less than or equal to end");
                return;
            }
            int result = clearBitsInRange(n, start, end);
            System.out.println("The new number: " + result);
        }
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    /**
     * To clear bits in the given range
     * 
     * @param n     the input integer
     * @param start the lower bit position to clear
     * @param end   the higher bit position to clear
     * @return the integer with start to end bits, set to 0
     */
    public static int clearBitsInRange(int n, int start, int end) {
        int a = -1 << (end + 1);
        int b = (1 << start) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
}