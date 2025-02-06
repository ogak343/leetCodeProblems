package problems;

public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {

    private LongestStrictlyIncreasingOrStrictlyDecreasingSubarray() {
    }

    public static int longestMonotonicSubarray(int[] nums) {
        int result1 = 1;
        int result2 = 1;
        int prev;
        for (int i = 0; i < nums.length; i++) {
            int preResult = 1;
            for (int j = i + 1; j < nums.length; j++) {
                prev = nums[j - 1];
                if (nums[j] > prev) {
                    preResult++;
                } else {
                    result1 = Math.max(result1, preResult);
                    break;
                }
            }
            result2 = Math.max(result2, preResult);
        }

        for (int i = 0; i < nums.length; i++) {
            int preResult = 1;
            for (int j = i + 1; j < nums.length; j++) {
                prev = nums[j - 1];
                if (nums[j] < prev) {
                    preResult++;
                } else {
                    result2 = Math.max(result2, preResult);
                    break;
                }
            }
            result2 = Math.max(result2, preResult);
        }

        return Math.max(result1, result2);
    }

}
