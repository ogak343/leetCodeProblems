package problems;

public class ClearDigits {
    private ClearDigits() {
    }

    public static String clearDigits(String s) {
        int remain = 0;
        byte[] marked = new byte[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                marked[i] = 1;
                remain++;
            }
            if (remain > 0 && (s.charAt(i) < '0' || s.charAt(i) > '9')) {
                marked[i] = 1;
                remain--;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (marked[i] == 0 && (s.charAt(i) < '0' || s.charAt(i) > '9')) {
                result.append(s.charAt(i));
            } else if (marked[i] == 1 && (s.charAt(i) >= '0' || s.charAt(i) <= '9') && remain > 0) {
                result.append(s.charAt(i));
                remain--;
            }
        }
        return result.toString();
    }
}
