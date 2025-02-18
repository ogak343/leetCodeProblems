package problems;

import java.util.HashSet;
import java.util.Set;

public class LetterTilePossibilities {
    private LetterTilePossibilities() {
    }

    public static int numTilePossibilities(String tiles) {

        Set<String> set = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];

        backTract(set, used, new StringBuilder(), tiles);

        return set.size() - 1;
    }

    private static void backTract(Set<String> set, boolean[] used, StringBuilder builder, String tiles) {

        set.add(builder.toString());

        for (int i = 0; i < tiles.length(); i++) {
            if (used[i]) continue;

            if (i > 0 && tiles.charAt(i) == tiles.charAt(i - 1) && used[i - 1]) continue;
            used[i] = true;
            builder.append(tiles.charAt(i));
            backTract(set, used, builder, tiles);
            used[i] = false;
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
