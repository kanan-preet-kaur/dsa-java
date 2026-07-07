import java.util.Scanner;

public class BinStrings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of binary strings: ");
            int size = sc.nextInt();
            if (size < 0) {
                System.out.println("Invalid input");
                return;
            }
            StringBuilder sb = new StringBuilder();
            printBinStrings(size, 0, sb);
        }
    }

    /**
     * Recursively prints all possible strings of size n with no consecutive 1's
     * <p>
     * Time Complexity: O(2^n), each position branches into two recursive choices
     * <p>
     * Space Complexity: O(n), at max n frames in the call stack
     * 
     * @param n       The size of the strings to be printed
     * @param prevBit The value of the last character appended in the string
     * @param sb      The StringBuilder building up the current string
     */
    public static void printBinStrings(int n, int prevBit, StringBuilder sb) {

        // Base case
        if (n == 0) {
            System.out.println(sb);
            return;
        }

        // Printing combinations by filling nth place with 0
        printBinStrings(n - 1, 0, sb.append("0"));

        // Removing 0 from the nth place
        sb.deleteCharAt(sb.length() - 1);

        // Printing combinations by filling nth place with 1
        if (prevBit == 0) {
            printBinStrings(n - 1, 1, sb.append("1"));
            sb.deleteCharAt(sb.length() - 1); // To restore StringBuilder to its previous state since it is mutable
        }
    }
}
