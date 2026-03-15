public class SmallestNum {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 2, 4, 8 };
        int smallest = findSmallest(arr);
        System.out.println("The smallest number in the array is: " + smallest);
    }

    public static int findSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
