import java.util.*;

public class TwoDArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows of matrix");
        int n = sc.nextInt();
        System.out.println("Enter no. of columns of matrix");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m]; // cells -> n*m

        // Taking input
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Printing the Matrix
        System.out.println("MATRIX:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Searching an element
        System.out.println("Enter the element to be searched in the matrix");
        int key = sc.nextInt();
        search(matrix, key);
        System.out.println("Largest Element in the matrix: " + findLargest(matrix));
        System.out.println("Smallest Element in the matrix: " + findSmallest(matrix));

        sc.close();
    }

    public static void search(int[][] arr, int key) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Element found at " + "(" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("Element not found");
    }

    public static int findLargest(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                largest = Math.max(largest, arr[i][j]);
            }
        }
        return largest;
    }

    public static int findSmallest(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                smallest = Math.min(smallest, arr[i][j]);
            }
        }
        return smallest;
    }
}
