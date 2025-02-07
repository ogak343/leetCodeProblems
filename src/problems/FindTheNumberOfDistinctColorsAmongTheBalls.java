package problems;

import java.util.HashMap;
import java.util.Map;

public class FindTheNumberOfDistinctColorsAmongTheBalls {
    private FindTheNumberOfDistinctColorsAmongTheBalls() {
    }

    public static int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> colorMap = new HashMap<>();
        int[] result = new int[queries.length];
        for (int index = 0; index < queries.length; index++) {
            int value = queries[index][1];
            if (map.get(queries[index][0]) != null && value != map.get(queries[index][0])) {
                colorMap.merge(value, 1, Integer::sum);
                colorMap.merge(map.get(queries[index][0]),1, (x, y) -> x - y);
                if (colorMap.get(map.get(queries[index][0])) < 1) {
                    colorMap.remove(map.get(queries[index][0]));
                }
            }
            else if (map.get(queries[index][0]) == null) {
                colorMap.merge(value, 1, Integer::sum);
            }

            map.put(queries[index][0], queries[index][1]);
            result[index] = colorMap.size();
        }
        return result;
    }
}
