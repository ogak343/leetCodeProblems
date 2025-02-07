package problems;

public class MaximumAscendingSubarraySum {

    private MaximumAscendingSubarraySum() {
    }

    public static int maxAscendingSum(int[] nums) {
        int result = 0;
        int subResult = 0;
        int previous = nums[0];
        for (int num : nums) {
            if (num > previous) {
                subResult += num;
                previous = num;
            } else {
                previous = num;
                subResult = num;
            }
            result = Math.max(result, subResult);
        }
        return result;
    }
}
