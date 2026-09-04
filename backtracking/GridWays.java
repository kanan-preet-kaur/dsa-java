import java.util.Scanner;

public class GridWays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows in the grid: ");
            int n = sc.nextInt();
            System.out.print("Enter the number of columns in the grid: ");
            int m = sc.nextInt();
            if (n < 0 || m < 0) {
                System.out.println("Invalid input!");
                return;
            }
            int count = countWays(n, m, 0, 0);
            System.out.println("Number of ways: " + count);
        }
    }

    /**
     * Recursively count ways in which we can reach target cell in a grid
     * 
     * <p>
     * Time Complexity: O(2^(n+m))
     * <p>
     * Space Complexity: O(n+m)
     * 
     * @param n The number of rows in the grid
     * @param m The number of columns in the grid
     * @param i The row number of the starting cell
     * @param j The column number of the starting cell
     * @return The number of ways in which we can go from the starting cell to the
     *         target cell
     */
    public static int countWays(int n, int m, int i, int j) {
        // Base case
        if (i == n - 1 && j == m - 1) { // condition for last cell
            return 1;
        } else if (i == n || j == m) { // boundary cross condition
            return 0;
        }

        // Ways if we go right
        int w1 = countWays(n, m, i, j + 1);
        // Ways if we go down
        int w2 = countWays(n, m, i + 1, j);

        int totalWays = w1 + w2;
        return totalWays;
    }
}