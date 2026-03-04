
import java.util.Scanner;

public class conditional {

    public static void main(String args[]) {

        //IF-ELSE STATEMENTS ->
        int age = 22;
        if (age >= 18) {
            //executes if the condition is true
            System.out.println("ADULT : drive, vote");
        } else {
            //executes if the condition is false
            System.out.println("NOT ADULT : can't drive, can't vote");
        }

        int A = 1;
        int B = 3;
        int C = 4;

        //Print the largest of the two
        if (A >= B) {
            System.out.println("A is the largest of 2");
        } else {
            System.out.println("B is the largest of 2");
        }

        //Print if a num is odd or even
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        //ELSE-IF STATEMENTS ->
        //Print the largest of the three
        if (A >= B && A >= C) {
            System.out.println("A is the largest");
        } else if (B >= C) {
            System.out.println("B is the largest");
        } else {
            System.out.println("C is the largest");
        }

        //Income-tax calculator
        int tax;
        System.out.println("Enter your income");
        int income = sc.nextInt();

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income <= 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Income Tax = " + tax);

        //TERNARY OPERATOR ->
        int number = 4;
        String result = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(result);

        int marks = 55;
        System.out.println((marks >= 33) ? "Pass" : "Fail");

        //SWITCH STATEMENT
        int numb = 2;
        switch (numb) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            case 4:
                System.out.println("Number is 4");
                break;
            case 5:
                System.out.println("Number is 5");
                break;
            default:
                System.out.println("Invalid number");
        }

        //CALCULATOR
        System.out.println("Enter the operation to be performed");
        char op = sc.next().charAt(0);

        A = 5;
        B = 10;
        switch (op) {
            case '+':
                System.out.println(A + B);
                break;
            case '-':
                System.out.println(A - B);
                break;
            case '*':
                System.out.println(A * B);
                break;
            case '/':
                System.out.println(A / B);
                break;
            case '%':
                System.out.println(A % B);
                break;
            default:
                System.out.println("Invalid operation");
        }

    }
}
