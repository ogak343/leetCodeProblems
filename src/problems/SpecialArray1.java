package problems;

public class SpecialArray1 {
    private SpecialArray1() {
    }

    public static boolean isArraySpecial(int[] nums) {

        int previous = nums[0] % 2;
        for (int index = 1; index < nums.length; index++) {
            if (previous == (nums[index] % 2)) {
                return false;
            }
            previous = nums[index] % 2;
        }
        return true;
    }
}
