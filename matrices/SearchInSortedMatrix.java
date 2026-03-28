
public class SearchInSortedMatrix {
    public static void main(String[] args) {

        int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 33;

        boolean result = staircaseSearch(matrix, key);
        if (!result) {
            System.out.println("Element not found!");
        }
    }

    // To check if an element exists in sorted matrix
    // Time Complexity: 0(n + m) (n: no. of rows, m: no. of columns)
    // Space Complexity: O(1)
    public static boolean staircaseSearch(int[][] matrix, int key) {
        int n = matrix.length; // no. of rows
        int m = matrix[0].length; // no. of columns

        int i = 0;
        int j = m - 1;

        while (i < n && j >= 0) {

            if (key == matrix[i][j]) {
                System.out.println("Element found at (" + i + "," + j + ")");
                return true;
            } else if (key < matrix[i][j]) {
                // left
                j--;
            } else {
                // bottom
                i++;
            }
        }

        return false;
    }
}