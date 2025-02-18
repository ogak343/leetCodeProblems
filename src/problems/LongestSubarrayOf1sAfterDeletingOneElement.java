package problems;

public class LongestSubarrayOf1sAfterDeletingOneElement {

    private LongestSubarrayOf1sAfterDeletingOneElement() {
    }

    public static int longestSubarray(int[] nums) {
        int count = 0;
        int i = 0;
        int j = 0;
        int result = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                count++;
            }
            while (count > 1) {
                if (nums[i] ==0) {
                    count--;
                }
                i++;
            }
            if (j - i > result) result = j - i;
            j++;
        }
        return result;
    }
}
