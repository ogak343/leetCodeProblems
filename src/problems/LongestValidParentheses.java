package problems;

import java.util.Stack;

public class LongestValidParentheses {

    private LongestValidParentheses() {
    }

    public static int task(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                }
                res = Math.max(res, i - stack.peek());
            }
        }
        return res;
    }
}
