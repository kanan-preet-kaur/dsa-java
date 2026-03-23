public class CountingSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 7, 4, 9, 10 };
        sortArr(arr);
        printArr(arr);
    }

    // Counting Sort
    // Time Complexity: O(n+range)
    // Space Complexity: O(range)
    public static void sortArr(int[] arr) {

        // finding largest number in array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // making count array
        int[] count = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
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