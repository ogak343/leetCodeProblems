package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {

    private UniqueNumberOfOccurrences() {
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.merge(num, 1, Integer::sum);
        }
        Set<Integer> set = new HashSet<>();
        map.forEach((k, v) -> set.add(v));
        return set.size() == map.size();
    }
}
