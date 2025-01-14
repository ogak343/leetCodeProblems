package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    private GroupAnagrams(){
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        char[] key;
        String keyStr;
        for (String str : strs) {
            key = str.toCharArray();
            Arrays.sort(key);
            keyStr = new String(key);
            Arrays.sort(key);
            if (map.get(keyStr) == null) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(keyStr, list);
            } else {
                map.get(keyStr).add(str);
            }
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {

            result.add(entry.getValue());
        }
        return result;
    }
}
