public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);
        System.out.println(~5);
        System.out.println(~0);
        System.out.println(5 << 2);
        oddOrEven(3);
    }

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}