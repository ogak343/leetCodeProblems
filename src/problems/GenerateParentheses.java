package problems;

import java.util.List;

public class GenerateParentheses {
    private GenerateParentheses() {
    }

    public static List<String> open(int n, int opened, int closed, String pattern, List<String> result) {

        StringBuilder current = new StringBuilder(pattern);
        for (int i = opened; i < n; i++) {
            current.append("(");
            opened++;
            close(n, opened, closed, current.toString(), result);
        }

        return result;
    }

    private static void close(int n, int opened, int closed, String pattern, List<String> result) {
        StringBuilder current = new StringBuilder(pattern);
        for (int i = closed; i < opened; i++) {
            current.append(")");
            closed++;
            if (closed == n) {
                result.add(current.toString());
                break;
            }
            open(n, opened, closed, current.toString(), result);
        }
    }
}
