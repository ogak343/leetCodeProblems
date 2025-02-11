package problems;

public class RemoveAllOccurrencesOfASubstring {
    private RemoveAllOccurrencesOfASubstring() {
    }

    public static String removeOccurrences(String s, String part) {

        char[] chars = new char[s.length()];
        int index = 0;
        int i = 0;
        while (i < s.length()) {
            chars[index] = s.charAt(i);
            if (index >= part.length() - 1 && isMatch(chars, part, index)) {
                index -= part.length();
            }
            index++;
            i++;
        }
        return new String(chars, 0, index);
    }

    private static boolean isMatch(char[] chars, String part, int index) {
        for (int i = 0; i < part.length(); i++) {
            if (chars[index - i] != part.charAt(part.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
