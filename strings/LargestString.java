public class LargestString {
    public static void main(String[] args) {
        String[] fruits = { "mango", "banana", "apple", "guava" };

        String largest = findLargest(fruits);
        System.out.println(largest);
    }

    /**
     * To find the largest String among an array of String
     * Time Complexity: O(n*m)
     * Space Complexity: O(1)
     */
    public static String findLargest(String[] fruits) {

        if (fruits == null || fruits.length == 0) {
            return null;
        }

        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) { // compares lexicographically
                largest = fruits[i];
            }
        }

        return largest;
    }
}