package problems;

public class ReverseVowelsOfAString {
    private ReverseVowelsOfAString() {
    }

    public static String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] charArray = s.toCharArray();
        while (i < j) {
            if (isVowel(charArray[i]) && isVowel(charArray[j])) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            } else if (isVowel(charArray[i])) {
                j--;
            } else if (isVowel(charArray[j])) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return new String(charArray);
    }

    private static boolean isVowel(char c) {
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        for (char c1 : vowels) {
            if (c1 == c) return true;
        }
        return false;
    }
}
