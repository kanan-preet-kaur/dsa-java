public class Triangle01 {
    public static void main(String[] args) {
        int n = 5;

        // outer loop -> Number of rows
        for (int i = 0; i < n; i++) {

            // inner loop -> Number of digits in each row
            for (int j = 0; j < i + 1; j++) {

                // printing 1s or 0s -> Condition
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else
                    System.out.print("0 ");

            }
            System.out.println();
        }
    }
}
