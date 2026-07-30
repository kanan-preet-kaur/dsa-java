import java.util.Scanner;

public class RoatedSortedArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of the rotated sorted array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Array: ");
            printArr(arr);
            System.out.print("Enter the target element to be found: ");
            int target = sc.nextInt();
            int index = searchTarget(arr, target, 0, size - 1);
            if (index == -1) {
                System.out.println("Target not found");
                return;
            }
            System.out.println(target + " found at index: " + index);
        }
    }

    /**
     * Recursively finds the index of the target element from a rotated sorted array
     * using modified binary search approach
     * 
     * <p>
     * Time Complexity: O(log n)
     * <p>
     * Space Complexity: O(log n)
     * 
     * @param arr    The sorted rotated array in which the target element if to be
     *               found
     * @param target The required element to be found in the rotated sorted array
     * @param si     The starting index of the subarray
     * @param ei     The ending index of the subarray
     * @return The index of the target element to be found
     */
    public static int searchTarget(int[] arr, int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // case 1
        if (arr[mid] >= arr[si]) {
            // case a:
            if (target >= arr[si] && target <= arr[mid]) {
                return searchTarget(arr, target, si, mid - 1);
            }
            // case b:
            else {
                return searchTarget(arr, target, mid + 1, ei);
            }
        }

        // case 2
        else {
            // case a:
            if (target >= arr[mid] && target <= arr[ei]) {
                return searchTarget(arr, target, mid + 1, ei);
            }
            // case b:
            else {
                return searchTarget(arr, target, si, mid - 1);
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
