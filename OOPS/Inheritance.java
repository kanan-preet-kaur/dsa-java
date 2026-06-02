public class Inheritance {
    public static void main(String[] args) {
        FishSL shark = new FishSL();
        shark.eat();
        DogML dobby = new DogML();
        dobby.legs = 4;
        dobby.breed = "German Shepherd";
        System.out.println(dobby.legs + " " + dobby.breed);
        dobby.breathe();
    }
}

// SINGLE LEVEL INHERITANCE
// Base Class
class AnimalSL {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived Class
class FishSL extends AnimalSL {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}

// MULTI-LEVEL INHERITANCE
class AnimalML {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class MammalML extends AnimalML {
    int legs;
}

class DogML extends MammalML {
    String breed;
}

// HIERARCHIAL INHERITANCE
class AnimalH {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class FishH extends AnimalH {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}

class MammalH extends AnimalH {
    int legs;

    void walk() {
        System.out.println("walks on ground");
    }
}

class BirdH extends AnimalH {
    void fly() {
        System.out.println("flies in the air");
    }
}
