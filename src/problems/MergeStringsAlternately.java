package problems;

public class MergeStringsAlternately {

    private MergeStringsAlternately() {
    }

    public static String mergeAlternately(String word1, String word2) {
        int index = 0;
        StringBuilder result = new StringBuilder();
        while (true) {
            if (index == word1.length() || index == word2.length()) {
                result.append(word1.substring(index)).append(word2.substring(index));
                break;
            } else {
                result.append(word1.charAt(index)).append(word2.charAt(index));
            }
            index++;
        }

        return result.toString();
    }
}
