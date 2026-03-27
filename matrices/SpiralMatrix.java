public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        printSpiral(matrix);
    }

    public static void printSpiral(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Spiral boundary - top, right, bottom, left

            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            if (startRow != endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
            }

            // left
            if (startCol != endCol) {
                for (int i = endRow - 1; i >= startRow + 1; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            // updating
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
}