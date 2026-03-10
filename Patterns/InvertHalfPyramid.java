public class InvertHalfPyramid {
    public static void main(String[] args) {
        int n = 4;

        // outer loop -> No. of rows
        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // stars
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }

            // Jump to next line after each row
            System.out.println();
        }
    }
}
