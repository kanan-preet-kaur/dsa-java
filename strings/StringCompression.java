public class StringCompression {
    public static void main(String[] args) {
        String str = "aaaabbbccdddefgh";
        String newStr = compressString(str);
        System.out.println(newStr);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static String compressString(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 1;
            while (i < str.length() - 1 && ch == str.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr.append(ch);

            if (count > 1) {
                newStr.append(count);
            }

        }

        return (newStr.length() < str.length()) ? newStr.toString() : str;
    }
}
