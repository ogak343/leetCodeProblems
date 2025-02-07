package problems;

public class CheckIfOneStringSwapCanMakeStringsEqual {

    private CheckIfOneStringSwapCanMakeStringsEqual() {
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int count = 0;
        char[] chars = new char[4];
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (count > 1) return false;
                chars[2 * count] = s1.charAt(i);
                chars[1 + 2 * count] = s2.charAt(i);
                count++;
            }
        }
        if (count == 1) return false;

        return (chars[0] == chars[1] && chars[2] == chars[3]) || (chars[0] == chars[3] && chars[2] == chars[1]);
    }
}
