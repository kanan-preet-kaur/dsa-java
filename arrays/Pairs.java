public class Pairs {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        printPairs(arr);
    }

    // Printing all possible pairs of elements of array
    public static void printPairs(int[] arr) {
        int pairCount = 0;

        // loop for elements of array
        for (int i = 0; i < arr.length; i++) {

            // loop for elements ahead of current element
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + " ");
                pairCount++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + pairCount);
    }
}