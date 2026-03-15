public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        int key = 14;
        int index = binarySearch(arr, key);
        if (index != -1) {
            System.out.println("The element is present at index: " + index);
        } else {
            System.out.println("Element not found!");
        }
    }

    public static int binarySearch(int[] arr, int key) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);

            // COMPARISONS
            if (key == arr[mid]) {
                return mid; // FOUND
            } else if (key > arr[mid]) {
                start = mid + 1; // RIGHT
            } else {
                end = mid - 1; // LEFT
            }

        }
        return -1;
    }
}
