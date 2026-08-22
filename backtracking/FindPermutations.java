import java.util.Scanner;

public class FindPermutations {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.next();
            printPermutations(str, "");
        }
    }

    /**
     * Recursively prints all permutations of a string
     * <p>
     * Time Complexity: O(n*n!), total n! permutations and n operations required to
     * find each permutation
     * <p>
     * Space Complexity: O(n^2), n space occupied the strings at each call and at
     * max, n frames in the call stack
     * 
     * @param str The string whose permutations are to be found
     * @param ans The permutation being formed
     */
    public static void printPermutations(String str, String ans) {

        // Base case
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }

        // Recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutations(newStr, ans + curr);
        }
    }
}