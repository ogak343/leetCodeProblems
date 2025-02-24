package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class EqualRowAndColumnPairs {

    private EqualRowAndColumnPairs() {
    }

    public static int equalPairs(int[][] grid) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        StringBuilder builder;
        for (int[] value : grid) {
            builder = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                builder.append(value[j]).append(",");
            }
            map1.merge(builder.toString(), 1, Integer::sum);
        }

        for (int i = 0; i < grid.length; i++) {
            builder = new StringBuilder();
            for (int[] ints : grid) {
                builder.append(ints[i]).append(",");
            }
            map2.merge(builder.toString(), 1, Integer::sum);
        }

        AtomicInteger result = new AtomicInteger(0);
        map1.forEach((k, v) -> result.getAndAdd(map1.getOrDefault(k, 0) * map2.getOrDefault(k, 0)));
        return result.get();
    }
}
