import java.util.Scanner;

public class ClearIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Enter the index no: ");
        int i = sc.nextInt();
        if (i < 0 || i > 31) {
            System.out.println("index must be between 0 and 31.");
            return;
        }
        int result = clearIthBit(n, i);
        System.out.println("The new number: " + result);
    }

    // To clear ith bit in a number
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        int newNo = n & bitMask;
        return newNo;
    }
}