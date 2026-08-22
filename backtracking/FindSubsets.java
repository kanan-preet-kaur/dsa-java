import java.util.Scanner;

public class FindSubsets {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.next();
            printSubsets(str, "", 0);
            System.out.println();
        }
    }

    /**
     * Recursively prints all possible subsets of String str, uses backtracking
     * <p>
     * Time Complexity: O(n * 2^n), 2^n subsets and n operatiosn are performed to
     * find each subset
     * <p>
     * Space Complexity: O(n), at max n frames at the call stack
     * 
     * @param str The String whose subsets are to be found
     * @param ans The subset formed at each recursive call
     * @param i   The index of the character to be added or not to be added in the
     *            current subset
     */
    public static void printSubsets(String str, String ans, int i) {
        // Base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("{null}");
            } else {
                System.out.print(ans + " ");
            }
            return;
        }

        // choice to be added in the subset
        printSubsets(str, ans + str.charAt(i), i + 1);
        // choice to not be added in the subset
        printSubsets(str, ans, i + 1);
    }
}
