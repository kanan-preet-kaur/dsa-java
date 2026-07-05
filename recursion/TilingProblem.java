import java.util.Scanner;

public class TilingProblem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length of the board to be filled with tiles: ");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Invalid Input!");
                return;
            }
            int ways = countWays(n);
            System.out.println("Number of ways in which tile can be placed: " + ways);
        }
    }

    /**
     * Recursively calculates the number of ways, tiles of sizes 2X1 can be placed
     * on a board of size 2Xn
     * 
     * <p>
     * Time Complexity: O(2^n), function is called twice for one value of n
     * <p>
     * Space Complexity: O(n), at max n frames in the call stack
     * 
     * @param n The length of the board to be filled with tiles
     * @return The number ways the tiles can be placed on the board
     * 
     */
    public static int countWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return countWays(n - 1) + countWays(n - 2);
    }
}