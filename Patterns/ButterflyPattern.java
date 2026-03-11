//Printing Butterfly Pattern in Java
public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 4;

        // Upper Half
        for (int i = 0; i < n; i++) {

            // stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }

            // spaces
            for (int k = 0; k < 2 * (n - (i + 1)); k++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 0; i--) {

            // stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }

            // spaces
            for (int k = 0; k < 2 * (n - (i + 1)); k++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
