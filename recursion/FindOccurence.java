import java.util.Scanner;

public class FindOccurence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 7, 3, 2, 7 };
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the key to be found in the array: ");
            int key = sc.nextInt();
            int firstOccur = firstOccur(arr, key, 0);
            if (firstOccur == -1) {
                System.out.println("Element NOT found!");
            } else {
                System.out.println("Element's first occurence found at index " + firstOccur);
            }
            int lastOccur = lastOccur(arr, key, arr.length - 1);
            if (lastOccur == -1) {
                System.out.println("Element NOT found!");
            } else {
                System.out.println("Element's last occurence found at index " + lastOccur);
            }
        }
    }

    /**
     * Recursively finds the first occurence of an element in the array
     * 
     * <p>
     * Time Complexity: O(n), one call per element
     * <p>
     * Space Complexity: O(n), one call frame per element in the call stack
     * 
     * @param arr The array in which the element is to be found
     * @param key The element whose first occurence is to be returned
     * @param i   The starting position of the array, to search the key
     * 
     * @return The index of the element to be found
     */
    public static int firstOccur(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccur(arr, key, i + 1);
    }

    /**
     * Recursively finds the last occurence of an element in an array
     * 
     * <p>
     * Time Complexity: O(n), one call per element
     * <p>
     * Space Complexity: O(n), one call frame per element in the stack
     * 
     * @param arr The array in which the element is to be found
     * @param key The element which is to be searched in the array
     * @param i   The starting position of the search in the array for the key
     * @return The index of the element to be found
     */
    public static int lastOccur(int[] arr, int key, int i) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lastOccur(arr, key, i - 1);
    }
}
