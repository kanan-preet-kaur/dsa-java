public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;
        int index = linearSearch(numbers, key);
        if (index != -1) {
            System.out.println("The element is present at index : " + index);
        } else {
            System.out.println("Element not Found");
        }
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
