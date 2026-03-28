import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = findDiagonalSum(matrix);
        System.out.println("Sum of Diagonals = " + sum);

        sc.close();
    }

    // To find combined sum of left and right diagonal
    // For odd matrices, center element is counted only once
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int findDiagonalSum(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int n = matrix.length; // size of matrix
        int sum = 0;

        for (int i = 0; i < n; i++) {

            // Primary Diagonal
            sum += matrix[i][i];

            // Secondary Diagonal
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }

        }

        return sum;
    }
}