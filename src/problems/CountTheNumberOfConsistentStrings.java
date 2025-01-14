package problems;

public class CountTheNumberOfConsistentStrings {

    private CountTheNumberOfConsistentStrings() {
    }

    public static int countConsistentStrings(String allowed, String[] words) {

        int result = 0;

        for (String word : words) {
            for (java.lang.Character c : word.toCharArray()) {
                if (!allowed.contains(c.toString())) {
                    result++;
                    break;
                }
            }
        }

        return words.length - result;
    }
}
