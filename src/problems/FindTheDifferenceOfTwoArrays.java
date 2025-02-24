package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheDifferenceOfTwoArrays {

    private FindTheDifferenceOfTwoArrays() {
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Map<Integer, Boolean> map1 = new HashMap<>();
        Map<Integer, Boolean> map2 = new HashMap<>();
        for (int j : nums1) {
            map1.put(j, true);
        }
        for (int j : nums2) {
            if (map1.containsKey(j)) {
                map1.put(j, false);
            } else {
                map2.put(j, true);
            }
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        map1.forEach((k, v) -> {
            if (Boolean.TRUE.equals(v)) {
                list1.add(k);
            }
        });
        map2.forEach((k, v) -> {
            if (Boolean.TRUE.equals(v)) {
                list2.add(k);
            }
        });
        return List.of(list1, list2);
    }
}
