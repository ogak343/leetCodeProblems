package problems;

import java.util.HashMap;
import java.util.Map;

public class TupleWithSameProduct {

    private TupleWithSameProduct() {
    }

    public static int tupleSameProduct(int[] nums) {

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];

                count+= map.getOrDefault(product, 0);

                map.put(product, map.getOrDefault(product, 0) + 1);
            }
        }
        return 8 * count;
    }
}
