//printing a solid Rhombus pattern
public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;

        // outer loop -> number of rows
        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // stars
            for (int k = 0; k < n; k++) {
                System.out.print("* ");
            }

            // jump to next line after printing each row
            System.out.println();
        }
    }
}
