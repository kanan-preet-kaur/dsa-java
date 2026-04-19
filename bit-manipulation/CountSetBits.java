import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int count = countSetBits(n);
            System.out.println("The number of set bits in the number: " + count);
        }
    }

    /**
     * Counts the set bits in binary representation of {@code n}.
     * 
     * @param n the input number
     * @return the count of set bits in the number {@code n}
     */
    public static int countSetBits(int n) {
        // Time Complexity: O(log n)
        // Space Complexity: O(1)
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}