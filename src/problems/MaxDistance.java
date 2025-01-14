package problems;

import java.util.List;

public class MaxDistance {

    private MaxDistance() {
    }

    public static int maxDistance(List<List<Integer>> arrays) {

        int[] min = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        int[] max = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        int pivotMin = 0;
        int pivotMax = 0;
        for (int i = 0; i < arrays.size(); i++) {
            if (arrays.get(i).get(0) < min[0]) {
                min[1] = min[0];
                min[0] = arrays.get(i).get(0);
                pivotMin = i;
            } else if (arrays.get(i).get(0) < min[1]) {
                min[1] = arrays.get(i).get(0);
            }
        }

        for (int i = 0; i < arrays.size(); i++) {
            if (arrays.get(i).get(arrays.get(i).size() - 1) >= max[0]) {
                max[1] = max[0];
                max[0] = arrays.get(i).get(arrays.get(i).size() - 1);
                pivotMax = i;
            } else if (arrays.get(i).get(arrays.get(i).size() - 1) > max[1]) {
                max[1] = arrays.get(i).get(arrays.get(i).size() - 1);
            }
        }

        if (pivotMin == pivotMax) {
            return Math.max(Math.abs(max[1] - min[0]), Math.abs(max[0] - min[1]));
        }


        return Math.abs(max[0] - min[0]);
    }
}
