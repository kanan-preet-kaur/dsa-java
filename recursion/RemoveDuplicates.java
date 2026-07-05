import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine().toLowerCase();

            boolean[] map = new boolean[26];
            StringBuilder newStr = new StringBuilder();
            removeDuplicates(str, map, 0, newStr);
        }
    }

    /**
     * Recursively removes duplicates from a string and prints the new String with
     * unique characters
     * 
     * <p>
     * Time Complexity: O(n), where n is the length of the string
     * <p>
     * Space Complexity: O(n), one call frame for each character in the call stack
     * 
     * @param str    The string from which duplicates are to be removed
     * @param map    The array which maps all alphabets to indices and keeps track
     *               of which characters are already appened in the new String
     * @param idx    The variable used to keep track of the current index
     * @param newStr The new string printed containing all unique characters
     */
    public static void removeDuplicates(String str, boolean[] map, int idx, StringBuilder newStr) {

        // Base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // Appended unique characters in new String
        char currChar = str.charAt(idx);
        if (!map[currChar - 'a']) {
            newStr.append(currChar);
            map[currChar - 'a'] = true;
        }

        // Recursive call
        removeDuplicates(str, map, idx + 1, newStr);

    }
}