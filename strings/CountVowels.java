import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        int count = countVowels(str);
        System.out.println("Number of lowercase vowels in the string: " + count);

        sc.close();
    }

    // To count the number of lowercase vowels in a string
    // Time Complexity: O(n)
    public static int countVowels(String str) {

        if (str.length() == 0 || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}