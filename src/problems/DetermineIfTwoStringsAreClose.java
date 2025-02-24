package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DetermineIfTwoStringsAreClose {

    private DetermineIfTwoStringsAreClose() {
    }

    public static boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) return false;
        Map<java.lang.Character, Integer> map1 = new HashMap<>();
        Map<java.lang.Character, Integer> map2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            map1.merge(c, 1, Integer::sum);
        }
        for (char c : word2.toCharArray()) {
            map2.merge(c, 1, Integer::sum);
        }

        return map1.keySet().equals(map2.keySet());
    }
}
