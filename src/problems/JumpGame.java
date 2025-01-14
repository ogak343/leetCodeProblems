package problems;

public class JumpGame {

    private JumpGame(){
    }

    public static int jump(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int pivot = 0;
        int recurse = 0;
        while (pivot < nums.length - 1) {
            int max = 0;
            int val = nums[pivot];
            while (pivot + val >= nums.length) {
                val--;
            }
            int offset = 0;
            for (int i = val; i > 0; i--) {
                if ((nums[pivot + i] + i > max) && (i + pivot < nums.length)) {
                    max = nums[i + pivot] + i;
                    offset = i;
                }
                if (pivot + offset == nums.length - 1) {
                    break;
                }
            }
            pivot += offset;
            recurse++;
        }
        return recurse;
    }
}
