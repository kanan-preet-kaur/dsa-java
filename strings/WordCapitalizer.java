import java.util.Scanner;

public class WordCapitalizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String newStr = capitalizeFirstLetters(str);
        System.out.println(newStr);

        sc.close();
    }

    // To convert first letter of each word to upper case
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static String capitalizeFirstLetters(String str) {

        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == 0 || str.charAt(i - 1) == ' ') {
                char newCh = Character.toUpperCase(ch);
                newStr.append(newCh);
            } else {
                newStr.append(ch);
            }
        }

        return newStr.toString();
    }
}