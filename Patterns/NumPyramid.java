public class NumPyramid {
    public static void main(String[] args) {
        int n = 5;

        // outer loop -> number of rows
        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + 1 + " ");
            }

            System.out.println();
        }
    }
}
