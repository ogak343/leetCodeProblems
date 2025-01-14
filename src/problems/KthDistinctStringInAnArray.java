package problems;

import java.util.ArrayList;
import java.util.List;

public class KthDistinctStringInAnArray {

    private KthDistinctStringInAnArray() {
    }

    public static String kthDistinct(String[] arr, int k) {

        List<String> list = new ArrayList<>();
        List<String> s1 = new ArrayList<>();
        for (String s : arr) {
            if (list.contains(s)) {
                list.remove(s);
                s1.add(s);
            }
            if (!s1.contains(s)) {
                list.add(s);
            }
        }
        if (list.size() >= k) {
            return list.get(k - 1);
        }
        return "";

    }
}
