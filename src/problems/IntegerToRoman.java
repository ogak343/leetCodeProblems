package problems;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class IntegerToRoman {

    private IntegerToRoman() {
    }

    public static String intToRoman(int num) {
        Map<Integer, List<String>> m1 = Map.of(1, List.of("I", "V", "X"), 2, List.of("X", "L", "C"), 3, List.of("C", "D", "M"), 4, List.of("M"));
        Map<Integer, List<Integer>> m2 = Map.of(1, List.of(0), 2, List.of(0, 0), 3, List.of(0, 0, 0), 4, List.of(0, 1), 5, List.of(1), 6, List.of(1, 0), 7, List.of(1, 0, 0), 8, List.of(1, 0, 0, 0), 9, List.of(0, 2));
        int index = 4;
        StringBuilder result = new StringBuilder();
        while (index > 0) {
            int finalIndex = index;
            Optional.ofNullable(m2.get((int) (num / Math.pow(10d, (index - 1))))).ifPresent(m -> m.forEach(inte -> result.append(m1.get(finalIndex).get(inte))));
            num = num % (int) Math.pow(10d, (index - 1));
            index--;
        }
        return result.toString();
    }
}
