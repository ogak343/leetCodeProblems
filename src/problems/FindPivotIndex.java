package problems;

public class FindPivotIndex {
    private FindPivotIndex() {
    }

    public static int pivotIndex(int[] nums) {
        int right = 0;
        for (int num : nums) {
            right += num;
        }
        int left = 0;
        right-= nums[0];
        if (right == 0) return 0;
        for (int i = 1; i < nums.length; i++) {
            right -= nums[i];
            left += nums[i - 1];
            if (left == right) return i;
        }
        return -1;
    }
}
