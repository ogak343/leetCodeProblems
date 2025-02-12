package problems;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfBadPairs {
    private CountNumberOfBadPairs() {
    }

    public static long countBadPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        long result = 0;
        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i] - i, 1, Integer::sum);
        }

        for (Integer value : map.values()) {
            result += (long) (value - 1) * value / 2;
        }

        return (long) nums.length * (nums.length - 1) / 2 - result;
    }
}
