public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 12, 6, 3, 4, 2 };
        System.out.println("Original Array:");
        printArr(arr);

        sortArr(arr);

        System.out.println("Sorted Array:");
        printArr(arr);
    }

    // Bubble Sort
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void sortArr(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
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