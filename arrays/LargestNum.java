public class LargestNum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 3, 5 };
        int largest = findLargest(arr);
        System.out.println("The largest number in the array is: " + largest);
    }

    public static int findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
