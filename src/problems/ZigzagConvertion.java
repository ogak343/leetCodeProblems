package problems;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConvertion {

    private ZigzagConvertion() {
    }

    public static String convert(String s, int n) {
        if (n == 1) {
            return s;
        }
        List<String> subs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            subs.add("");
        }
        for (int i = 0; i < s.length(); i++) {
            int r = cR(i, n);
            if (r == 0) {
                subs.set(0, subs.get(0) + s.charAt(i));
            } else {
                if (r < n) {
                    subs.set(r, subs.get(r) + s.charAt(i));
                } else {
                    subs.set(2 * n - 2 - r, subs.get(2 * n - 2 - r) + s.charAt(i));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        subs.forEach(sb::append);
        return sb.toString();
    }

    public static int cR(int i, int n) {
        return i % (2 * n - 2);
    }
}
