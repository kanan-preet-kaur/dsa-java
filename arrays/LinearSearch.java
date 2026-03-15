public class LinearSearch {
    public static void main(String[] args) {

        //FOR INTEGERS 
        int[] numbers = { 2, 4, 6, 8, 10, 12, 14 };
        int intKey = 10;
        int intIndex = linearSearch(numbers, intKey);
        if (intIndex != -1) {
            System.out.println("The element is present at index : " + intIndex);
        } else {
            System.out.println("Element not Found");
        }

        // FOR STRINGS
        String[] fruits = { "Apple", "Mango", "Guava", "Grapes", "Banana", "Watermelon", "Jackfruit", "Berries" };
        String stringKey = "Berries";
        int stringIndex = linearSearch(fruits, stringKey);
        if (stringIndex != -1) {
            System.out.println("The element is present at index : " + stringIndex);
        } else {
            System.out.println("Element not Found");
        }
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
}
