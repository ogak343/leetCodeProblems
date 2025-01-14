package problems;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    private SingleNumber(){
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.remove(num);
            } else {
                map.put(num, num);
            }
        }
        return map.values().iterator().next();
    }
}
