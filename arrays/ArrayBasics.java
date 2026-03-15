import java.util.*;

public class ArrayBasics {
    public static void main(String[] args) {

        // creating an array
        int marks[] = new int[50];
        int numbers[] = { 1, 2, 3 }; // Java automatically detects the size
        int moreNums[] = { 4, 5, 6, 7 };
        String fruits[] = { "apple", "mango", "guava" };

        // Taking input in an array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of maths");
        marks[0] = sc.nextInt();
        System.out.println("Enter marks of physics");
        marks[1] = sc.nextInt();
        System.out.println("Enter marks of chemistry");
        marks[2] = sc.nextInt();

        // System.out.println("Enter marks of three subjects : ");
        // for (int i = 0; i < 3; i++) {
        // marks[i] = sc.nextInt();
        // }

        // Printing the elements of array
        System.out.println("Maths : " + marks[0]);
        System.out.println("Physics : " + marks[1]);
        System.out.println("Chemistry : " + marks[2]);

        // Updating elements of the array
        marks[2] = 99;
        System.out.println("Chemistry : " + ++marks[2]);
        double percentage = (marks[0] + marks[1] + marks[2]) / 3.0;
        System.out.println(percentage);

        // Finding length of the array
        System.out.println(marks.length);

        System.out.println("fruits[1] : " + fruits[1]);
        update(fruits);
        System.out.println("fruits[1] :" + fruits[1]);

        addOne(numbers);
        // Printing the elements of an array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }

    // Updating value of array, arrays are passed by reference
    public static void update(String fruits[]) {
        fruits[1] = "grapes";
    }

    // Add 1 to each element of the array
    public static void addOne(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }
}