public class SudokuSolver {
    public static void main(String[] args) {
        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };
        if (sudokuSolver(sudoku, 0, 0)) {
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists");
        }
    }

    /**
     * Recursively solves a sudoku using backtracking
     * 
     * <p>
     * Time Complexity: O(9^E), where E is the number of empty cells
     * <p>
     * Space Complexity: O(1)
     * 
     * @param sudoku The 9X9 grid, in which we have to solve the sudoku
     * @param row    The row number of the cell to be filled
     * @param col    The column number of the cell to be filled
     * @return true if the sudoku is solved else false
     */
    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        if (row == 9) {
            return true;
        }
        int nextRow = row, nextCol = col + 1;
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoku[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(sudoku, row, col, i)) {
                    sudoku[row][col] = i;
                    if (sudokuSolver(sudoku, nextRow, nextCol)) {
                        return true;
                    }
                    sudoku[row][col] = 0;
                }
            }
        } else {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        return false;
    }

    /**
     * Checks if it is safe to place the digit in the current cell
     * <p>
     * Time Complexity: O(1)
     * <p>
     * Space Complexity: O(1)
     * 
     * @param sudoku The 9X9 grid to be filled
     * @param row    The row number of the cell to be filled
     * @param col    The column number of the cell to be filled
     * @param num    The digit to be checked
     * @return true if it is safe for the digit to be placed else false
     */
    public static boolean isSafe(int[][] sudoku, int row, int col, int num) {
        // checking in that particular row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == num) {
                return false;
            }
        }

        // checking in that particular column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == num) {
                return false;
            }
        }

        // checking in the mini grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sudoku[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
}