public class Count7s {
    public static void main(String[] args) {
        int[][] matrix = { { 4, 7, 8 }, { 8, 8, 7 } };
        int count = count7s(matrix);
        System.out.println("Frequency of 7: " + count);
    }

    public static int count7s(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }
}