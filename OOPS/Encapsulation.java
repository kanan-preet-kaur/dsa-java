public class Encapsulation {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        // p1.color = "Yellow";
        // System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "shruti";
        myAcc.setPassword("7gh26291h");
    }
}

class Pen {
    private String color;
    private int tip;

    // getters
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // setters
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String newPassword) {
        password = newPassword;
    }
}

class Student {
    int age;
    String name;
    float percentage;

    void calcPercentage(int phy, int chem, int maths) {
        percentage = (phy + chem + maths) / 3;
    }
}