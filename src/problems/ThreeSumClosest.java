package problems;

import java.util.Arrays;

public class ThreeSumClosest {

    private ThreeSumClosest() {
    }

    public static int threeSumClosest(int[] nums, int target) {
        nums = Arrays.stream(nums).sorted().toArray();
        int first = 0, second, third;
        nums = Arrays.stream(nums).sorted().toArray();
        int res = Integer.MAX_VALUE;
        int current;
        int ret = 0;
        for (first = 0; first < nums.length; first++) {
            second = first+1;
            third = nums.length - 1;
            while (first < nums.length - 1 && first < second && second < third) {
                current = nums[first] + nums[second] + nums[third];
                if (res > Math.abs(target- current)) {
                    ret = current;
                    res = Math.abs(target- current);
                }
                if (current < target) {
                    second++;
                } else if (current > target) {
                    third--;
                } else {
                    return current;
                }
            }
        }
        return ret;
    }
}
