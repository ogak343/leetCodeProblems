package problems;

import java.util.HashMap;
import java.util.Map;

public class BitwiseXorOfAllPairings {
    private BitwiseXorOfAllPairings() {
    }

    public static int xorAllNums(int[] nums1, int[] nums2) {
        final int[] result = {0};
        Map<Integer, Integer> map = new HashMap<>();

        for (int a : nums1) {
            if (map.get(a) != null) {
                map.merge(a, nums2.length, Integer::sum);
            } else {
                map.put(a, nums2.length);
            }
        }
        for (int b : nums2) {
            if (map.get(b) != null) {
                map.merge(b, nums1.length, Integer::sum);
            } else {
                map.put(b, nums1.length);
            }
        }
        map.forEach((x, y) -> {
            if (y % 2 != 0) {
                result[0] ^= x;
            }
        });

        return result[0];
    }
}
