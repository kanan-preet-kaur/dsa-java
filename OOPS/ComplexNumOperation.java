import java.util.Scanner;

public class ComplexNumOperation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the real part of the first complex number: ");
            int real1 = sc.nextInt();
            System.out.print("Enter the imaginary part of the first complex number: ");
            int img1 = sc.nextInt();

            System.out.print("Enter the real part of the second complex number: ");
            int real2 = sc.nextInt();
            System.out.print("Enter the imaginary part of the second complex number: ");
            int img2 = sc.nextInt();

            Complex obj1 = new Complex(real1, img1);
            Complex obj2 = new Complex(real2, img2);

            Complex sumResult = obj1.calcSum(obj2);
            System.out.println("Adding the two complex numbers: " + sumResult.real + " + " + sumResult.img + "i");
            Complex diffResult = obj1.calcDiff(obj2);
            System.out
                    .println("Subtracting the two complex numbers: " + diffResult.real + " + " + diffResult.img + "i");
            Complex productResult = obj1.calcProduct(obj2);
            System.out.println(
                    "Multiplying the two complex numbers: " + productResult.real + " + " + productResult.img + "i");

        }
    }
}

/**
 * Class represents a complex number with real and imaginary parts 
 * Contains methods for addtion, subtraction and multiplication operations on complex number
 */
class Complex {
    int real;
    int img;

    Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    Complex calcSum(Complex obj2) {

        int r1 = this.real;
        int img1 = this.img;
        int r2 = obj2.real;
        int img2 = obj2.img;

        return new Complex((r1 + r2), (img1 + img2));
    }

    Complex calcDiff(Complex obj2) {

        int r1 = this.real;
        int img1 = this.img;
        int r2 = obj2.real;
        int img2 = obj2.img;

        return new Complex((r1 - r2), (img1 - img2));
    }

    Complex calcProduct(Complex obj2) {

        int r1 = this.real;
        int img1 = this.img;
        int r2 = obj2.real;
        int img2 = obj2.img;

        return new Complex(((r1 * r2) - (img1 * img2)), ((r1 * img2) + (img1 * r2)));
    }
}
