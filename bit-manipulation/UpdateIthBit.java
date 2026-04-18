import java.util.Scanner;

public class UpdateIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Enter the index no: ");
        int i = sc.nextInt();
        System.out.println("Enter the new bit");
        if (i < 0 || i > 31) {
            System.out.println("index must be between 0 and 31.");
            return;
        }
        int newBit = sc.nextInt();
        int result = updateIthBit(n, i, newBit);
        System.out.println("The new number: " + result);
    }

    // To update the ith bit with the given bit
    // Time Complexity: O(1)
    // Time Complexity: O(1)
    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        int newNo = n & bitMask;
        return newNo;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        int newNo = n | bitMask;
        return newNo;
    }
}