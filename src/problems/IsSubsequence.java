package problems;

public class IsSubsequence {

    private IsSubsequence() {
    }

    public static boolean isSubsequence(String s, String t) {
        int j = 0;
        if (j == s.length()) return true;
        for (int i = 0; i < t.length(); i++) {

            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
        }
        return j == s.length();
    }
}
