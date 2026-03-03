
public class operators {

    public static void main(String args[]) {
        int a = 10;
        int b = 5;

        //ARITHMETIC OPERATORS ->
        System.out.println("Add = " + (a + b));
        System.out.println("Sub = " + (a - b));
        System.out.println("Mul = " + (a * b));
        System.out.println("Div = " + (a / b));
        System.out.println("Remainder = " + (a % b));

        a = 10;
        int c = ++a; //pre-increment
        System.out.println(a);
        System.out.println(c);

        a = 10;
        int d = a++; //post-increment
        System.out.println(a);
        System.out.println(d);

        a = 10;
        int e = --a; //pre-decrement
        System.out.println(a);
        System.out.println(e);

        a = 10;
        int f = a--; //post-decrement
        System.out.println(a);
        System.out.println(f);

        //RELATIONAL OPERATORS ->
        int k = 5;
        int x = 10;
        System.out.println("== Checks Equality = " + (k == x));
        System.out.println("!= Checks Inequality = " + (k != x));
        System.out.println("> Checks Greater = " + (k > x));
        System.out.println("< Checks Smaller = " + (k < x));
        System.out.println(">= Checks Greater or Equal = " + (k >= x));
        System.out.println("<= Checks Smaller or Equal = " + (k <= x));

        //LOGICAL OPERATORS ->
        //LOGICAL AND
        System.out.println((3 > 2) && (4 > 5)); //Both should be true to get true else it'll be false
        System.out.println((3 > 2) && (5 > 4)); //BOTH TRUE- TRUE (else false)

        //LOGICAL OR
        System.out.println((3 > 2) || (4 > 5)); //Both should be false to get false else it'll be true
        System.out.println((3 < 2) || (5 < 4)); //BOTH FALSE- FALSE (else true)

        //LOGICAL NOT
        System.out.println(!(3 < 2));

        //ASSIGNMENT OPERATORS ->
        int A = 10;
        int B = 5;

        A = B; //value of right assignemnt to left, A becomes 5
        System.out.println("Value of A is "+A);

        A += 5; //A = A + 5
        System.out.println("Value of A is "+A);

        A -= 6; //A = A - 6
        System.out.println("Value of A is "+A);

        A /= 2; //A = A / 2
        System.out.println("Value of A is "+A);

        A *= 9; //A = A * 9
        System.out.println("Value of A is "+A);
    }
}
