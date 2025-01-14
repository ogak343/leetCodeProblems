package problems;

public class LongestPalindromicSubstring {

    private LongestPalindromicSubstring() {
    }

    public static String task(String s) {
        String res = "";
        int length = 0;
        String substring = "";
        for (int i = 0; i < s.length() - length; i++) {
            for (int j = i; j < s.length(); j++) {
                substring = s.substring(i, j + 1);
                if (palindromic(substring) && substring.length() > length) {
                    length = substring.length();
                    res = substring;
                }
            }
        }
        return res;
    }

    private static boolean palindromic(String substring) {
        int length = substring.length();
        for (int i = 0; i < (length + 1) / 2; i++) {
            if (substring.charAt(i) != substring.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
