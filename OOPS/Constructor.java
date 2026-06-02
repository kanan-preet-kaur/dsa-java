public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Christy");
        System.out.println(s2.name);
        Student s3 = new Student(23);
        System.out.println(s3.roll);

        Student s4 = new Student();
        s4.name = "Jade";
        s4.roll = 45;
        s4.password = "abcd";
        s4.marks[0] = 100;
        s4.marks[1] = 90;
        s4.marks[2] = 80;

        Student s5 = new Student(s4); // copy
        s5.password = "xyz";
        s4.marks[2] = 85;
        for (int i = 0; i < 3; i++) {
            System.out.print(s5.marks[i] + " ");
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // constructor
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    Student(String name) {
        this.name = name;
        marks = new int[3];
    }

    Student(int roll) {
        this.roll = roll;
        marks = new int[3];
    }

    // Shallow Copy Constructor
    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

    // Deep Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}