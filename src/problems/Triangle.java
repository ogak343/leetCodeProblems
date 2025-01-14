package problems;

import java.util.Collections;
import java.util.List;

public class Triangle {

    private Triangle(){
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        for (int i = 1; i < triangle.size(); i++) {
            var list = triangle.get(i);
            var preList = triangle.get(i - 1);

            for (int j = 0; j < list.size(); j++) {
                if (j == 0) {
                    list.set(j, preList.get(j) + list.get(j));
                } else if (j == list.size() - 1) {
                    list.set(j, preList.get(j - 1) + list.get(j));
                } else {
                    list.set(j, Math.min(preList.get(j - 1), preList.get(j)) + list.get(j));
                }
            }
        }
        var last = triangle.get(triangle.size() - 1);
        Collections.sort(last);
        return last.get(0);
    }
}
