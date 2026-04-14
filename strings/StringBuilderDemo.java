public class StringBuilderDemo {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }

        System.out.println(sb);
    }
}