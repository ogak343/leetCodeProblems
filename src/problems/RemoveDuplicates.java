package problems;

public class RemoveDuplicates {

    private RemoveDuplicates() {
    }

    public static int removeDuplicates(int[] nums) {
        int d = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i]==nums[i+1]) {
                d++;
                nums[i] = 101;
            }
        }
        int[] res = new int[nums.length - d];
        d = 0;
        for (int num : nums) {
            if (num < 101) {
                res[d] = num;
                d++;
            }
        }
        return nums.length;
    }
}
