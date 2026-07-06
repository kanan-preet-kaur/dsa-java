import java.util.Scanner;

public class FriendsPairing {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of friends to be paired: ");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid Input");
                return;
            }
            int ways = countPairingWays(n);
            System.out.println("Number of ways in which " + n + " friends can be paired: " + ways);
        }
    }

    /**
     * Recursively calculates the number of ways in which pairs of a group of n
     * friends can be made, where each person can either stay single or pair with
     * exactly one friend.
     * 
     * <p>
     * Time Complexity: O(2^n), exponential branching, roughly 2 recursive calls per
     * invocation
     * <p>
     * Space Complexity: O(n), at max n frames in the call stack at a given time
     * 
     * @param n The number of friends to be paired
     * @return The number of ways n friends can be paired
     */
    public static int countPairingWays(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        int singleChoice = countPairingWays(n - 1); // n-1 friends left after a person chose to remain single
        int pairChoice = (n - 1) * countPairingWays(n - 2); // a person can pair with another in n-1 ways and
                                                            // after pairing, n-2 friends are left to be paired

        return singleChoice + pairChoice;
    }
}