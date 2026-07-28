import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array to be sorted: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Original Array: ");
            printArr(arr);

            quickSort(arr, 0, arr.length - 1);

            System.out.print("Sorted Array: ");
            printArr(arr);
        }
    }

    /**
     * Recursively sorts the original array in ascending order using quick sort
     * implementation
     * 
     * <p>
     * Time Complexity:
     * Best Case: O(n log n)
     * Average Case: O(n log n)
     * Worst Case: O(n²)
     *
     * <p>
     * Space Complexity:
     * Average Case: O(log n)
     * Worst Case: O(n)
     * 
     * @param arr The array to be sorted in ascending order
     * @param si  The starting index of the subarray to be sorted
     * @param ei  The ending index of the subarray to be sorted
     */
    public static void quickSort(int[] arr, int si, int ei) {
        // Base Case
        if (si >= ei) {
            return;
        }

        // Step 1 -> pivot
        int pivot = arr[ei];

        // Step 2 -> partition
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            int currEl = arr[j];
            if (currEl < pivot) {
                // increment i
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // placing pivot in right position -> swap
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        // Step 3 -> call quickSort for left and right parts
        quickSort(arr, si, i - 1);
        quickSort(arr, i + 1, ei);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
