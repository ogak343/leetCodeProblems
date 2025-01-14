package problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    private LongestSubstringWithoutRepeatingCharacters(){
    }

    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        if (s.length()==1) {
            res = 1;
        }
        s+=" ";
        Set<java.lang.Character> chars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            chars.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (!chars.contains(s.charAt(j))) {
                    chars.add(s.charAt(j));
                    if (j - i > res) {
                        res = j - i;
                    }
                } else {
                    if (j - i > res) {
                        res = j - i;
                    }
                    break;
                }
            }
            chars.clear();
        }
        return res;
    }
}
