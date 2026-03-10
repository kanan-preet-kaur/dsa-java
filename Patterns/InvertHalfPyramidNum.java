public class InvertHalfPyramidNum {
    public static void main(String[] args) {
        int n = 5;

        // outer loop -> number of lines
        for (int i = 0; i < n; i++) {

            // numbers
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + 1 + " ");
            }

            // Jump to next line
            System.out.println();
        }
    }
}
