public class BacktrackingArrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }

    /**
     * Demonstrates backtracking by updating the array while recursively calling the
     * function and make changes in those values while backtracking
     * <p>
     * Time Complexity: O(n), n operations performed
     * <p>
     * Space Complexity: O(n), at max n frames in the call stack
     * 
     * @param arr The array to be modified
     * @param i   The index of the array whose value is to be updated
     * @param val The value to be stored at the particular index
     */
    public static void changeArr(int[] arr, int i, int val) {
        // Base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // Recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1); // func call step
        arr[i] = arr[i] - 2; // backtracking step
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}