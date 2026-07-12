import java.util.Scanner;

public class ConvertToString {
    public static final String[] DIGIT_TO_WORDS = { "zero", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine" };

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a positive number whose last digit is not 0: ");
            int n = sc.nextInt();
            if (n % 10 == 0 || n < 0) {
                System.out.println("Invalid Input!");
                return;
            }
            printString(n);
        }
    }

    /**
     * Recursively prints each digit of a number in words
     * 
     * <p>
     * Time complexity: O(n), where n is the number of digits in the entered number
     * <p>
     * Space Complexity: O(n), one call frame per element in the call stack
     * 
     * @param n The number to be written in words
     */
    public static void printString(int n) {
        if (n == 0) {
            return;
        }
        int lastDigit = n % 10;
        printString(n / 10);
        System.out.print(DIGIT_TO_WORDS[lastDigit]);
        System.out.print(" ");
    }
}
