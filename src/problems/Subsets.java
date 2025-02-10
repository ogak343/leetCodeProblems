package problems;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    private Subsets() {
    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        backTrack(result, nums, new ArrayList<>(), 0);
        return result;
    }

    private static void backTrack(List<List<Integer>> result, int[] nums, List<Integer> sub, int index) {
        for (int i = index; i < nums.length; i++) {
            sub.add(nums[i]);
            result.add(new ArrayList<>(sub));
            backTrack(result, nums, sub, i + 1);
            sub.remove(sub.size() - 1);
        }
    }
}
