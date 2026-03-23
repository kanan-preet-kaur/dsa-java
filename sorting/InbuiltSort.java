import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String[] args) {
        int[] arr = { 6, 5, 3, 7, 8, 10, 34, 2, 21 };
        int[] nums = { 5, 4, 3, 1, 6, 22, 26, 27, 27 };

        // Inbuilt Sorting Function
        // Time Complexity: O(n log n)
        // Space Complexity: O(log n)
        Arrays.sort(arr);
        Arrays.sort(nums, 0, 4);
        System.out.println("Ascending Order: ");
        printArr(arr);
        printArr(nums);

        Integer[] intArr = { 6, 5, 3, 7, 8, 10, 34, 2, 21 };
        Integer[] intNums = { 5, 4, 3, 1, 6, 22, 26, 27, 27 };

        Arrays.sort(intArr, Collections.reverseOrder());
        Arrays.sort(intNums, 0, 4, Collections.reverseOrder());
        System.out.println("Descending Order: ");
        printArr(intArr);
        printArr(intNums);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArr(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}