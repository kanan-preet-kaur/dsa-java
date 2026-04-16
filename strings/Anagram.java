public class Anagram {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        boolean result = areAnagrams(str1, str2);
        System.out.println(
                result ? "The Strings are anagrams of each other." : "The Strings are NOT anagrams of each other.");
    }

    // To check if two strings contain the same characters
    // Time Complexity: O(n)
    public static boolean areAnagrams(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] alphabets = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            alphabets[ch1 - 'a']++;
            alphabets[ch2 - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (alphabets[i] != 0) {
                return false;
            }
        }

        return true;
    }
}