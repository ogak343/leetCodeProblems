package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

    private static final Map<Integer, List<java.lang.Character>> map = Map.of(2, List.of('a', 'b', 'c'), 3, List.of('d', 'e', 'f'), 4, List.of('g', 'h', 'i'), 5, List.of('j', 'k', 'l'), 6, List.of('m', 'n', 'o'), 7, List.of('p', 'q', 'r', 's'), 8, List.of('t', 'u', 'v'), 9, List.of('w', 'x', 'y', 'z'));

    private LetterCombinationsOfAPhoneNumber(){
    }

    private static List<String> task(String digits) {
        List<String> result = new ArrayList<>();
        recursiveFunction(0, digits.length(), new StringBuilder(), digits, result);

        return result;
    }

    private static void recursiveFunction(int index, int limit, StringBuilder current, String digits, List<String> result) {

        if (index == limit && limit != 0) {
            result.add(current.toString());
            return;
        }
        if (index == digits.length()) {
            return;
        }
        map.get(java.lang.Character.getNumericValue(digits.charAt(index))).forEach(x -> {
            current.append(x);
            recursiveFunction(index + 1, limit, current, digits, result);
            current.deleteCharAt(current.length() - 1);
        });

    }
}
