package problems;

public class MaximumAverageSubarray1 {

    private MaximumAverageSubarray1() {
    }

    public static double findMaxAverage(int[] nums, int k) {
        int subarraySum = 0;
        for (int i = 0; i < k; i++) {
            subarraySum += nums[i];
        }
        int sum = subarraySum;
        for (int i = k; i < nums.length; i++) {
            subarraySum += (nums[i] - nums[i - k]);
            sum = Math.max(sum, subarraySum);
        }
        return (double) sum / k;
    }
}
