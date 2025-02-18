package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MaxNumberOfKSumPairs {
    private MaxNumberOfKSumPairs() {

    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                result++;
                i++;
                j--;
            } else if (nums[i] + nums[j] < k) {
                i++;
            } else if(nums[i] + nums[j] > k) {
                j--;
            }
        }
        return result;
    }
}
