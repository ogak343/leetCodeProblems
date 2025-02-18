package problems;

public class MaxConsecutiveOnes3 {
    private MaxConsecutiveOnes3() {
    }

    public static int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int result = 0;
        while (j < nums.length) {
            if (k >= 0 && nums[j] == 1) {
                j++;
            } else if(k > 0 && nums[j] == 0) {
                k--;
                j++;
            } else if (nums[i] == 0) {
                k++;
                i++;
            } else {
                i++;
            }
            result = Math.max(result, j - i);
        }
        return result;
    }
}
