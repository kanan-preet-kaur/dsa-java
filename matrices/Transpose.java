public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("ORIGINAL MATRIX:");
        printMatrix(matrix);
        findTranspose(matrix);
    }

    // To find transpose of a matrix
    // Time Complexity: O(n*m)
    // Space Complexity: O(n*m)
    public static void findTranspose(int[][] matrix) {
        int n = matrix.length; // no. of rows of original matrix
        int m = matrix[0].length; // no. of columns of original matrix
        int[][] transpose = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("TRANSPOSED MATRIX:");
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}