package problems;

public class ProductOfArrayExceptSelf {

    private ProductOfArrayExceptSelf() {
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            prefix[i + 1] = prefix[i] * nums[i];
        }
        int multiplier = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            multiplier *= nums[i + 1];
            prefix[i] = prefix[i] * multiplier;
        }
        return prefix;
    }
}
