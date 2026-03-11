//Printing a Hollow Rhombus pattern
public class HollowRhombus {
    public static void main(String[] args) {
        int n = 5;

        // outer loop -> number of rows
        for (int i = 0; i < n; i++) {

            // spaces in front
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // stars
            for (int k = 0; k < n; k++) {
                if (i == 0 || i == n - 1 || k == 0 || k == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // jump to next line
            System.out.println();
        }
    }
}
