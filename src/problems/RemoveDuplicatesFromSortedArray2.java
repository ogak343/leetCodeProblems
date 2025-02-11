package problems;

public class RemoveDuplicatesFromSortedArray2 {
    private RemoveDuplicatesFromSortedArray2() {
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int offset = 0;
        int previous = -10001;
        for (int j = 0; j < nums.length; j++) {
            if (previous == nums[j]) {
                count++;
                if (count > 1) {
                    offset++;
                    continue;
                }
            } else {
                count = 0;
                previous = nums[j];
            }
            nums[j - offset] = nums[j];
        }
        return nums.length - offset;
    }
}
