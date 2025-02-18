package problems;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    private MaximumNumberOfVowelsInASubstringOfGivenLength() {
    }

    public static int maxVowels(String s, int k) {

        byte[] vowels = new byte[26];
        vowels['a' - 97] = 1;
        vowels['e' - 97] = 1;
        vowels['i' - 97] = 1;
        vowels['o' - 97] = 1;
        vowels['u' - 97] = 1;

        int sub = 0;
        for (int i = 0; i < k; i++) {
            sub += vowels[s.charAt(i) - 97];
        }
        int max = sub;
        for (int i = k; i < s.length(); i++) {
            sub += vowels[s.charAt(i) - 97] - vowels[s.charAt(i - k) - 97];
            max = Math.max(max, sub);
        }
        return max;
    }
}
