package problems;

import java.util.Arrays;
import java.util.Stack;

public class ConstructSmallestNumberFromDIString {
    private ConstructSmallestNumberFromDIString() {
    }

    public static String smallestNumber(String pattern) {

        int n = pattern.length();
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= n; i++) {
            stack.push(i + 1);
            if (i == n || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }
        return sb.toString();
    }
}
