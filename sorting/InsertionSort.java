public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 12, 3, 2, 1 };

        System.out.println("Original Array:");
        printArr(arr);

        sortArr(arr);

        System.out.println("Sorted Array:");
        printArr(arr);
    }

    // Insertion Sort
    // Time Complexity: Worst Case -> O(n^2) ; Best Case -> O(n)
    // Space Complexity: O(1)
    public static void sortArr(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}