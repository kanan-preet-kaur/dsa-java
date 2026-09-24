import java.util.ArrayList;

public class BasicsOfArrayList {
    public static void main(String[] args) {
        // ArrayList is a part of Java Collection Framework
        // Classname objName = new Classname();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Operations on ArrayList

        // Add element O(1)
        list.add(1);
        list.add(2);
        list2.add("Steve");
        list2.add("Sarah");
        list3.add(true);
        list3.add(false);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);

        // Get element O(1)
        System.out.println(list.get(1));
        System.out.println(list2.get(1));
        System.out.println(list3.get(1));

        // Remove element O(n)
        list.remove(1);
        list2.remove(1);
        list3.remove(1);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);

        // Set element at index O(n)
        list.set(0, 10);
        list2.set(0, "John");
        list3.set(0, false);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);

        // Contains element O(n)
        System.out.println(list.contains(10));
        System.out.println(list.contains(11));

        list.add(2);
        list.add(3);
        System.out.println(list);

        //Adds element at a specific index and shift others to right O(n)
        list.add(1, 11);
        System.out.println(list);

        // Size of ArrayList
        System.out.println(list.size());

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}