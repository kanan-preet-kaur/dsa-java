public class SecondRowSum {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int sum = secondRowSum(matrix);
        System.out.println("Sum of 2nd row elements: " + sum);

    }

    // To find sum of second row elements of a matrix
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int secondRowSum(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int j = 0; j < matrix[1].length; j++) {
            sum += matrix[1][j];
        }

        return sum;
    }
}