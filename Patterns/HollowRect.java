public class HollowRect {
    public static void main(String[] args) {
        int row = 7, col = 10;

        // outer loop -> Traversing rows
        for (int i = 0; i < row; i++) {

            // inner loop -> Traversing each col of the row one by one
            for (int j = 0; j < col; j++) {
                //cell - (i,j)

                // Boundary condition
                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
