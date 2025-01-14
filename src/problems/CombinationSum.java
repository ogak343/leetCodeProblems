package problems;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    private static int count = 0;

    private CombinationSum() {
    }

    private static List<List<Integer>> task(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        recursiveFunction(0, 0, new ArrayList<>(), candidates, target, result);

        return result;
    }

    private static void recursiveFunction(int index, int sum, List<Integer> cCandidates, int[] candidates, int target, List<List<Integer>> result) {
        count++;
        if (sum == target) {
            result.add(new ArrayList<>(cCandidates));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            cCandidates.add(candidates[i]);
            recursiveFunction(i, sum + candidates[i], cCandidates, candidates, target, result);
            cCandidates.remove(cCandidates.size() - 1);
        }
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CombinationSum.count = count;
    }
}
