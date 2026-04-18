import java.util.Scanner;

public class GetIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the index of the bit to find");
        int i = sc.nextInt();
        if (i < 0 || i > 31) {
            System.out.println("i must be between 0 and 31.");
            return;
        }
        int result = getIthBit(n, i);
        System.out.println("Bit at " + i + ": " + result);

        sc.close();
    }

    // Returns ith bit of the number
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }

    }
}
