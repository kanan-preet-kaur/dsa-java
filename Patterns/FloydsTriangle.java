public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;

        // outer loop -> number of rows
        for (int i = 0; i < n; i++) {

            // inner loop -> number of times counter variable is printed in each row
            for (int j = 0; j < i + 1; j++) {
                System.out.print(num + " "); // printing counter variable
                num++; // updating counter variable
            }

            System.out.println();
        }
    }
}