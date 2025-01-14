package problems;

public class SortColors {

    private SortColors(){
    }

    public static void sortColors(int[] nums) {
        int[] s = new int[3];
        for (int num : nums) {
            if (num == 0) {
                s[0]++;
            } else if (num == 1) {
                s[1]++;
            } else {
                s[2]++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (s[0] > 0) {
                nums[i] = 0;
                s[0]--;
            } else if (s[1] > 0) {
                nums[i] = 1;
                s[1]--;
            } else {
                nums[i] = 2;
                s[2]--;
            }
        }
    }
}
