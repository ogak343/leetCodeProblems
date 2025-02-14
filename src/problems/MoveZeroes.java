package problems;

public class MoveZeroes {
    private MoveZeroes() {
    }

    public static void moveZeroes(int[] nums) {
        int i = 0, j = 0, temp;
        while (j < nums.length && i < nums.length) {
            if (nums[i] == 0 && nums[j] != 0 && i < j) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                i++;
            } else if (nums[i] != 0) {
                i++;
            } else {
                j++;
            }
        }
    }
}
