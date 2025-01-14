package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumPushes {

    private MinimumPushes(){
    }

    public static int minimumPushes(String word) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        for(int i = 0; i < word.length(); i++) {
            map.merge(word.charAt(i), 1, Integer::sum);
        }
        List<Integer> list = new ArrayList<>(map.values().stream().toList());
        list.sort(Collections.reverseOrder());
        for(int i = 0; i < list.size(); i++) {
            res+= (list.get(i) * (i / 8 + 1));
        }
        return res;
    }
}
