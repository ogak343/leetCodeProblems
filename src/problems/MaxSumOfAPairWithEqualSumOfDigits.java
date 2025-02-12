package problems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class MaxSumOfAPairWithEqualSumOfDigits {
    private MaxSumOfAPairWithEqualSumOfDigits() {
    }

    public static int maximumSum(int[] nums) {
        int[] sums = new int[81];
        int result = -1;
        for (int num : nums) {
            int sum = calculateDigitSum(num, -1);
            if (sums[sum] != 0 && num + sums[sum] > result) {
                result = num + sums[sum];
            }
            if (num > sums[sum]) {
                sums[sum] = num;
            }
        }
        return result;
    }

    private static int calculateDigitSum(int num, int result) {
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}
