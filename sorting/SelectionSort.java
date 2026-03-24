public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 17, 5, 3 };
        System.out.println("Original Array:");
        printArr(arr);

        sortArr(arr);

        System.out.println("Sorted Array:");
        printArr(arr);
    }

    // Selection Sort
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void sortArr(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}