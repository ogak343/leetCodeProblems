package problems;

public class ReverseWordsInAString {
    private ReverseWordsInAString() {
    }

    public static String reverseWords(String s) {
        char[] chars = s.trim().toCharArray();
        int i = chars.length - 1, j = chars.length - 1;
        StringBuilder builder = new StringBuilder();
        while (true) {
            if (i == 0) {
                if (!builder.isEmpty() && builder.charAt(builder.length() - 1) != ' ') builder.append(' ');
                if (chars[i] != ' ') builder.append(chars, i, j - i + 1);
                break;
            } else if (chars[i] == ' ') {
                if (!builder.isEmpty() && builder.charAt(builder.length() - 1) != ' ') builder.append(' ');
                builder.append(chars, i + 1, j - i);
                i--;
                j = i;
            } else {
                i--;
            }
        }
        return builder.toString();
    }
}
