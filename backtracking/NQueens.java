import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of square chessboard: ");
            int n = sc.nextInt();
            char[][] board = new char[n][n];

            // initialize the board
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j] = '.';
                }
            }

            nQueens(board, 0);
        }
    }

    /**
     * Recurisvely places n queens on an n*n square chessboard such that no queen
     * can attack any other queen
     * <p>
     * Time Complexity: O(n!)
     * <p>
     * Space Complexity: O(n)
     * 
     * @param board The chessboard on which n queens are to be placed
     * @param row   The starting row of the chessboard
     */
    public static void nQueens(char[][] board, int row) {
        // Base case
        if (row == board.length) {
            printBoard(board);
            return;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = '.';
            }
        }
    }

    /**
     * Checks if it is safe to place a queen at a particular cell on the board
     * 
     * <p>
     * Time Complexity: O(n)
     * <p>
     * Space Complexity: O(1)
     * 
     * @param board The board on which the queen is to be placed safely
     * @param row   The row number of the cell to be checked
     * @param col   The column number of the cell to be checked
     * @return true if it is safe to place the queen at the particular cell
     */
    public static boolean isSafe(char[][] board, int row, int col) {
        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonally left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonally right up
        for (int i = row - 1, j = col + 1; i >= 0 && j <= board.length - 1; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char[][] board) {
        System.out.println("------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}