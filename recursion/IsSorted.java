import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.print("Enter the elements in the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            if (isSorted(arr, 0)) {
                System.out.println("The array is sorted");
            } else {
                System.out.println("The array is NOT sorted");
            }
        }
    }

    /**
     * Recursively checks if an array is sorted in ascending order
     * 
     * <p>
     * Time Complexity: O(n), one call per element
     * <p>
     * Space Complexity: O(n), at max, n call frames in the stack
     * 
     * @param arr the array to be checked
     * @param i   the starting position of the array
     * 
     * @return true if array is sorted, false if array is not sorted
     */
    public static boolean isSorted(int arr[], int i) {
        if (arr.length == 0 || i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }
}