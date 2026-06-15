public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(4, 5));
        System.out.println(calc.sum(3.4f, 5.6f));
        System.out.println(calc.sum(3, 4, 5));

        Deer d = new Deer();
        d.eat();
    }
}

// METHOD OVERLOADING
class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// METHOD OVERRIDING
class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}
