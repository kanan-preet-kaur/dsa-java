public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = { -2, 4, 6, -8, 10, -12, 14 };
        // int maxSum = bruteForce(arr);
        // int maxSum = prefixSum(arr);
        int maxSum = kadanes(arr);
        System.out.println("Maximum Subarray sum: " + maxSum);
    }

    // APPROACH 1 -> Brute Force
    // Time: O(n^3) | Space: O(1)
    public static int bruteForce(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < arr.length; start++) {

            for (int end = start; end < arr.length; end++) {

                int currSum = 0;
                for (int k = start; k <= end; k++) {
                    // subarray sum
                    currSum += arr[k];
                }

                // Comparing current sum and maximum sum
                maxSum = Math.max(currSum, maxSum);
            }
        }

        return maxSum;
    }

    // APPROACH 2 -> Prefix Sum
    // Time: O(n^2) | Space: O(n)
    public static int prefixSum(int[] arr) {
        int[] prefix = new int[arr.length];

        // calculating prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // calculating maximum subarray sum
        int maxSum = Integer.MIN_VALUE;
        int subarraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                subarraySum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, subarraySum);
            }
        }
        return maxSum;
    }

    // APPROACH 3 -> Kadane's Algorithm
    // Time: O(n) | Space: O(1)
    public static int kadanes(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
