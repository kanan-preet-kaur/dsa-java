public class Abstraction {
    public static void main(String[] args) {

        // Animal -> Horse -> Mustang
        Mustang m = new Mustang();
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.eatMeat();
        b.eatPlants();
    }
}

// ABSTRACT CLASS
abstract class Animal {

    String color;

    Animal() {
        System.out.println("Animal constructor called");
        color = "brown";
    }

    // non-abstract method
    void eat() {
        System.out.println("animal eats");
    }

    // abstract method
    abstract void walk();
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {

    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}

// INTERFACES
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all four directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right - by one step");
    }
}

// Multiple Inheritance using interfaces
interface Herbivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore {
    public void eatPlants() {
        System.out.println("Bear eats plants");
    }

    public void eatMeat() {
        System.out.println("Bear eats meat");
    }
}