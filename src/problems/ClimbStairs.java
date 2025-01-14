package problems;

public class ClimbStairs {

    private ClimbStairs() {
    }

    public static int climbStairs(int n) {
        int result = 0;
        if (n == 1) {
            return 1;
        }
        int index = 1;
        double product = 1;
        for (int i = 0; i <= n / 2; i++) {
            index = 1;
            product = 1;
            for (int j = n - 2 * i + 1; j <= n - i; j++) {
                if (i == 1) {
                    product *= (n - 1);
                }
                if (i > 1) {
                    product = (product * j) / index;
                }
                index++;
            }
            result += (int) product;
        }
        return result;
    }
}
