import java.util.Scanner;

public class MergeSort {
    public static void main(String args[]) {
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

            mergeSort(arr, 0, arr.length - 1);

            System.out.print("Sorted Array: ");
            printArr(arr);
        }

    }

    /**
     * Recursively sorts the elements of the array in ascending order
     * <p>
     * Time Complexity: O(n log n)
     * <p>
     * Space Complexity: O(n)
     * 
     * @param arr The array to be sorted
     * @param si  The starting index of the array to be sorted
     * @param ei  The ending index of the array to be sorted
     */
    public static void mergeSort(int[] arr, int si, int ei) {
        // Base Case
        if (si >= ei) {
            return;
        }

        // finding middle
        int mid = si + (ei - si) / 2;

        // Left part
        mergeSort(arr, si, mid);
        // Right part
        mergeSort(arr, mid + 1, ei);

        // merge
        merge(arr, si, mid, ei);

    }

    /**
     * Sorts and merges the two halves of the array
     * 
     * @param arr The array to be sorted
     * @param si  The starting index of the left half of the array
     * @param mid The middle index
     * @param ei  The ending index of the right half of the array
     */
    public static void merge(int[] arr, int si, int mid, int ei) {

        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i];
                i++;
            } else {
                temp[k++] = arr[j];
                j++;
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i];
            i++;
        }
        while (j <= ei) {
            temp[k++] = arr[j];
            j++;
        }

        // copying temp array in original array
        for (i = si, k = 0; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}