import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'd' };

        // Methods to declare a String
        String str = "abcd";
        String str2 = new String("xyz");

        // Strings are IMMUTABLE

        // INPUT
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name = sc.next(); // To input a word
        // System.out.println("Your name is " + name);
        System.out.println("Enter your full name");
        String fullName = sc.nextLine(); // To input more than one word
        System.out.println("Your full name is " + fullName);
        System.out.println(fullName.length()); // to find the length of String
        System.out.println(fullName.charAt(0)); // To extract a single character of String at a particular index
        printLetters(fullName);

        // CONCATENATION
        String firstName = "Tony";
        String lastName = "Stark";
        String name = firstName + " " + lastName;
        System.out.println(name);
    }

    // To extract and print all characters of a String
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
}