package problems;

public class ReverseInteger {
    private ReverseInteger() {
    }

    public static int reverse(int x) {
        int r = 0;
        while (x != 0) {
            if (r < -214748364 || r > 214748364) {
                return 0;
            }
            r = r * 10 + x % 10;
            x = x / 10;
        }
        return r;
    }
}
