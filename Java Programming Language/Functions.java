import java.util.*;

public class Functions {

    public static void printHelloWorld() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {
        printHelloWorld(); // function call
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a, b); // arguments or actual parameters
        int product = product(a, b);
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " X " + b + " = " + product);
        System.out.println("Enter the number to find factorial");
        int k = sc.nextInt();
        int fact = factorial(k);
        System.out.println(k + "! = " + fact);
        // Binomial coefficient
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        int nCr = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("Value of nCr = " + nCr);
        System.out.println(add(2, 3));
        System.out.println(add(2.9f, 3.01f));
        System.out.println(add(1, 2, 3));
        System.out.println("Enter the range in which you want to print prime numbers");
        System.out.println("Start :");
        int start = sc.nextInt();
        System.out.println("End : ");
        int end = sc.nextInt();
        printPrime(start, end);
        System.out.println("Enter a binary number");
        int num = sc.nextInt();
        System.out.println(binToDec(num));
        System.out.println("Enter a decimal number");
        int decNum = sc.nextInt();
        System.out.println(decToBin(decNum));
        System.out.println("Enter your number");
        int number = sc.nextInt();
        System.out.println(isPalindrome(number) ? "Is a palindrom number" : "Not a palindrome number");
        System.out.println("Sum of digits : " + sumOfDig(number));

        // CALL BY VALUE DEMONSTRATION ->
        swap(a, b);
        // same values be printed, cause values are swapped in
        // swap function and not reflected outside the function
        // because java calls by value
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
        int x = 5;
        changeX(x);
        System.out.println(x); // 5, since java always calls by value

    }

    // Function to check if a number is prime or not
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to print all prime numbers in a range
    public static void printPrime(int start, int end) {
        System.out.println("Prime numbers in the range are :");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to swap
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    // Function to change the value of x
    public static void changeX(int x) {
        x = 2;
    }

    // Function with parameters
    // function to add 2 numbers
    public static int sum(int a, int b) { // formal parameters or parameters
        int sum = a + b;
        return sum;
    }

    // function to multiply 2 numbers
    public static int product(int a, int b) {
        int product = a * b;
        return product;
    }

    // FACTORIAL ->
    public static int factorial(int x) {
        int fact = 1;
        if (x == 1 || x == 0) {
            return 1;
        }
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // FUNCTION OVERLOADING ->
    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static int add(int a, int b, int c) { // same function name, different parameters
        return a + b + c;
    }

    // function to convert binary to decimal
    public static int binToDec(int n) {
        int pow = 0, dec = 0, ld = 0;
        while (n > 0) {
            ld = n % 10;
            dec = dec + (ld * ((int) Math.pow(2, pow)));
            pow++;
            n = n / 10;
        }
        return dec;
    }

    // Function to convert decimal to binary
    public static int decToBin(int n) {
        int bin = 0, pow = 0;
        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * ((int) Math.pow(10, pow)));
            pow++;
            n = n / 2;
        }
        return bin;
    }

    // SCOPE
    // function scope ->
    public static void func() {
        // System.out.println(s); -> gives error because compiler executes line by line
        int s = 45;
        System.out.println(s); // no error
        // value of s can not be used outside this function
        // Variable defined/declared inside a method can not be used outside that
        // function/method
        // we can only pass and use that variable as a parameter outside the function
        // else not

        // Block scope, a block a piece of code in curly braces
        {
            int value = 10;
            System.out.println(value); // no error
            // variables defined/declared inside a block can be used anywhere inside that
            // block
        }

        // Variable defined/declared inside a block can not be used outside that block
        // System.out.println(value); -> gives error
    }

    // Program to check if a number is palindrome
    public static boolean isPalindrome(int n) {
        int num = n; // storing original number
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10; // extracting last digit
            rev = (rev * 10) + lastDigit; // cal reverse of the number
            n = n / 10; // removing last digit
        }
        return num == rev;
    }

    // Function to compute sum of digits in an integer
    public static int sumOfDig(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }
        return sum;
    }

}