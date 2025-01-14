package problems;

import java.util.HashSet;
import java.util.Set;

public class Character {

    private Character(){
    }

    public static int task(String s) {

        int length = 0;
        Set<java.lang.Character> set = new HashSet<>();
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            } else {
                boolean hasDuplicate = true;
                while (hasDuplicate) {
                    set.remove(s.charAt(left));
                    left++;
                    if (!set.contains(s.charAt(i))) {
                        set.add(s.charAt(i));
                        hasDuplicate = false;
                    }
                }
            }
            if (set.size() > length) {
                length = set.size();
            }
        }
        return length;
    }
}
