public class Subarrays {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        printSubarrays(arr);
    }

    // Printing subarrays
    public static void printSubarrays(int[] arr) {
        int n = arr.length;
        for (int start = 0; start < n; start++) {

            for (int end = start; end < n; end++) {

                int sum = 0;
                System.out.print("{ ");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " "); // subarray
                    sum += arr[k];
                }
                System.out.print("} ");
                System.out.println("Sum: " + sum);

            }
            System.out.println();
        }
        System.out.println("Total Subarrays: " + (n * (n + 1) / 2));
    }
}
