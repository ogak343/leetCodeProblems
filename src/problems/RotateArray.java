package problems;

import java.util.Arrays;

public class RotateArray {

    private RotateArray(){
    }

    public static int[] rotate(int[] nums, int k) {

        if (nums.length <= k) {
            k %= nums.length;
        }

        int[] head = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        int[] tail = Arrays.copyOfRange(nums, 0, nums.length - k);
        System.arraycopy(head, 0, nums, 0, head.length);
        System.arraycopy(tail, 0, nums, head.length, tail.length);
        return nums;
    }
}
