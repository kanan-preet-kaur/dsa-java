import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }

        sc.close();
    }

    // Check if a String is palindrome or not
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static boolean isPalindrome(String str) {

        if (str == null) {
            return false;
        }

        if (str.isEmpty()) {
            return true;
        }

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
