public class DiamondPattern {
    public static void main(String[] args) {
        int n = 4;

        // Upper Half Diamond->
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            // stars
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("* ");
            }
            // Jump to next line
            System.out.println();
        }

        // Lower Half Diamond
        for (int i = n - 2; i >= 0; i--) {
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            // stars
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print(("* "));
            }
            // Jump to next line
            System.out.println();
        }
    }
}
