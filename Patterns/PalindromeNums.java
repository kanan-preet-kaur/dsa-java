public class PalindromeNums {
    public static void main(String[] args) {
        int n = 5;

        // number of rows
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            // numbers
            int num = i + 1;
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(num + " ");
                // updating value of num
                if (k > i - 1) { // ascending half
                    num++;
                } else { // descending half
                    num--;
                }
            }
            // Jump to next line
            System.out.println();
        }
    }
}
