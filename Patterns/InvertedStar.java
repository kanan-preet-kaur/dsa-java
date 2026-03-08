//Inverted Right Angled Triangle Star Pattern
public class InvertedStar {
    public static void main(String[] args) {
        int n = 4; //total number of lines

        //no. of lines
        for (int i = 1; i <= n; i++) {

            //stars in each line
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}