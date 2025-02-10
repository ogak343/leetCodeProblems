package problems;

public class MaximumSubarray {
    private MaximumSubarray() {
    }

    public static int maxSubArray(int[] nums) {
        int subResult = 0;
        int result = -10000;
        for (int num : nums) {
            subResult = Math.max(subResult + num, num);
            result = Math.max(subResult, result);
        }
        return result;
    }
}