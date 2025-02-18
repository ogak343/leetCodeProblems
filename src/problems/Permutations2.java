package problems;

import java.util.ArrayList;
import java.util.List;

public class Permutations2 {
    private Permutations2() {
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backTrack(res, new ArrayList<>(), nums, used);
        return res;
    }

    private static void backTrack(List<List<Integer>> res, List<Integer> sub, int[] nums, boolean[] used) {
        if (sub.size() == nums.length) {
            res.add(new ArrayList<>(sub));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            sub.add(nums[i]);
            backTrack(res, sub, nums, used);
            used[i] = false;
            sub.remove(sub.size() - 1);

        }
    }
}
