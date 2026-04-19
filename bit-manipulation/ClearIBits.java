import java.util.Scanner;

public class ClearIBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Enter the number of bits to be cleared: ");
        int i = sc.nextInt();
        if (i < 0 || i > 31) {
            System.out.println("Bits must be between 0 and 31.");
            sc.close();
            return;
        }
        int result = clearIBits(n, i);
        System.out.println("The new number: " + result);

        sc.close();
    }

    // To clear given number of bits in the number
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static int clearIBits(int n, int i) {
        int bitMask = -1 << i;
        int newNo = n & bitMask;
        return newNo;
    }
}