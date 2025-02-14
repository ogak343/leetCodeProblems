package problems;

public class IncreasingTripletSubsequence {

    private IncreasingTripletSubsequence() {
    }

    public static boolean increasingTriplet(int[] nums) {

        if (nums.length < 3) return false;
        int[] prefix = new int[nums.length - 2];
        prefix[0] = nums[0];
        int[] postfix = new int[nums.length - 2];
        int length = postfix.length;
        postfix[length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length - 2; i++) {
            prefix[i] = Math.min(prefix[i - 1], nums[i]);
            postfix[length - i - 1] = Math.max(postfix[length - i], nums[length - i + 1]);
        }

        for (int i = 0; i < length; i++) {
            if (prefix[i] < nums[i + 1] && nums[i + 1] < postfix[i]) {
                return true;
            }
        }
        return false;
    }
}
