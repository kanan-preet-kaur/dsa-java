
public class datatypes {

    public static void main(String args[]) {
        int number = 90;
        System.out.println(number);
        byte b = 8;
        System.out.println(b);
        char ch = 'a';
        System.out.println(ch);
        boolean var = false;
        System.out.println(var);
        float price = 10.5f;
        System.out.println(price);

        //long -> very large size integer
        //double -> very large size floating point numbers
        short num = 240;
        System.out.println(num);

        //Type casting
        float a = 34.15f;
        int c = (int) a;
        System.out.println(c);

        //Type promotion
        char d = 'd';
        char e = 'e';
        System.out.println(d); //d
        System.out.println((int) d); //100
        System.out.println(e - d); //1 Java automatically converts char/byte/short to integer in expressions

        //char c = e-d; // error, can't convert from int to char (e-d) is now an int
        float f = 56.12f;
        long g = 45;
        double i = 65.87678;
        double h = f + g + i; //entire expression gets converted to double
        System.out.println(h);

        char ch2 = '2';
        int ch3 = ch2 * 3; //entire exp is converted to int, can't store in char 
        System.out.println(ch3); 

        char ch4 = '2';
        char ch5 = (char)(ch4 * 2); //type casting
        System.out.println(ch5); 

    }
}
