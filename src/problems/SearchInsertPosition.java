package problems;

public class SearchInsertPosition {

    private SearchInsertPosition() {
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {

            if (nums[start] > target) {
                return 0;
            }
            if (target > nums[end]) {
                return nums.length;
            }
            if (nums[start] == target) {
                return start;
            } else if (nums[end] == target) {
                return end;
            }
            if (end == start + 1) {
                return end;
            }
            if (nums[(start + end) / 2] <= target) {
                start = (start + end) / 2;
            } else if (nums[(start + end) / 2] > target) {
                end = (start + end) / 2;
            }
        }
        return start;
    }
}
