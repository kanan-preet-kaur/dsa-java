public class Super {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        super(); // calls base class constructor, when this isn't written, java by default calls
                 // this
        super.color = "brown";
        System.out.println("Horse constructor is called");
    }
}