import java.util.Scanner;

public class loops {
    public static void main(String args[]) {
        int counter = 0;

        // WHILE LOOP ->
        while (counter < 3) {
            System.out.println("Hello World!");
            counter++;
        }
        System.out.println("Printed 7 times");

        // Print numbers from 1 to 10
        int i = 1;
        System.out.println("Numbers from 1 to 10:");
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // Print numbers from 1 to n
        i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number");
        int n = sc.nextInt();
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); // to jump to next line

        // Print sum of first n natural numbers
        int sum = 0;
        i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);

        // FOR LOOP ->
        for (i = 0; i < n; i++) {
            System.out.println("Hello World");
        }

        // Print square pattern
        System.out.println("Enter the size of square pattern");
        n = sc.nextInt();

        System.out.println("Using for loop:");
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Using while loop:");
        int k, x = 0;
        while (x < n) {
            k = 0;
            while (k < n) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            x++;
        }

        // Print Reverse of a number
        System.out.println("Enter the number to be reversed");
        int num = sc.nextInt();

        // Reverse printed
        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num /= 10;
        }

        // Reverse calculated
        int rev = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            rev = (rev * 10) + lastdigit;
            num /= 10;
        }

        // DO-WHILE LOOP ->
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);

        i = 167;
        // loop runs at least once even if the condition is false
        do {
            System.out.println(i);
            i++;
        } while (i < 1); // condition checked after execution

        // BREAK STATEMENT
        for (i = 1; i < 7; i++) {
            System.out.print(i);
            if (i == 4) {
                break; // exit as soon as 4 is printed
            }
        }
        System.out.println();

        // keep entering numbers until a user enters a multiple of 10
        while (true) {
            System.out.print("Enter your number : ");
            num = sc.nextInt();
            if (num % 10 == 0) {
                break;
            }
            System.out.println(num);
        }

        // CONTINUE STATEMENT ->
        for (i = 0; i < 6; i++) {
            if (i == 3) {
                continue; // continue the loop, skip this iteration
            }
            System.out.println(i);
        }

        // add all numbers entered by user except multiples of 10
        sum = 0;
        i=1;
        while (i<5) {
            System.out.print("Enter your number: ");
            n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            sum += n;
            i++;
        }
        System.out.println("Sum = "+sum);
    }
}