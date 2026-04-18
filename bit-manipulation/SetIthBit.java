import java.util.Scanner;

public class SetIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the index of the bit to set");
        int i = sc.nextInt();
        if (i < 0 || i > 31) {
            System.out.println("index must be between 0 and 31.");
            return;
        }
        int result = setIthBit(n, i);
        System.out.println("New Number: " + result);

        sc.close();
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        int newNo = n | bitMask;
        return newNo;

    }
}