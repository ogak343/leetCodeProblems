package problems;

public class JumpGate2 {

    private JumpGate2() {
    }

    public static boolean canJump(int[] nums) {
        int index = nums.length - 1;
        while (index > 0) {
            int count = 1;
            boolean success = false;
            while (index - count >= 0) {
                if (nums[index - count] >= count) {
                    index -= count;
                    success = true;
                    break;
                }
                count++;
            }
            if (!success) {
                return false;
            }
        }
        return true;
    }
}
