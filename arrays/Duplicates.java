public class Duplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        boolean result = checkDuplicates(nums);
        System.out.println(result);

        System.out.println(checkDuplicates(new int[] { 1, 2, 3, 4 }));
        System.out.println(checkDuplicates(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));
    }

    // To check if array contains duplicates
    // Time Complexity: O(n²)
    // Space Complexity: O(1)
    public static boolean checkDuplicates(int[] arr) {
        if (arr == null || arr.length < 2) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
