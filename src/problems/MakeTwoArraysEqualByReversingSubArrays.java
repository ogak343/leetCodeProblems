package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MakeTwoArraysEqualByReversingSubArrays {

    private MakeTwoArraysEqualByReversingSubArrays(){
    }

    private static boolean canBeEqual(int[] target, int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < target.length; i++) {
            map.merge(target[i], 1, Integer::sum);
            map2.merge(arr[i], 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            if (!Objects.equals(entry.getValue(), map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;

    }
}
