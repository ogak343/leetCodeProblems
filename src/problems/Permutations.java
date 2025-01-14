package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    private Permutations() {
    }

    public static List<List<Integer>> task(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutations(0, nums.length, new ArrayList<>(), nums, result);

        return result;
    }

    private static void permutations(int index, int limit, List<Integer> current, int[] nums, List<List<Integer>> result) {

        if (index == limit) {
            result.add(new ArrayList<>(current));
            return;
        }
        Arrays.stream(nums).forEach(x -> {
            if (!current.contains(x)) {
                current.add(x);
                permutations(index + 1, limit, current, nums, result);
                current.remove(current.size() - 1);
            }
        });

    }
}
