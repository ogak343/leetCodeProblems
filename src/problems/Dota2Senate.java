package problems;

public class Dota2Senate {

    private Dota2Senate() {
    }

    public static String predictPartyVictory(String senate) {

        boolean[] invalids = new boolean[senate.length()];
        int r = 0;
        int d = 0;
        int invalidR = 0;
        int invalidD = 0;
        int i = 0;
        int rRate = 0;
        for (char c : senate.toCharArray()) {
            if (c == 'R') {
                r++;
            } else {
                d++;
            }
        }
        while (true) {
            if (r == invalidR) {
                return "Dire";
            } else if (d == invalidD) {
                return "Radiant";
            }
            if (!invalids[i] && senate.charAt(i) == 'R') {
                if (rRate < 0) {
                    invalids[i] = true;
                    invalidR++;
                }
                rRate++;
            } else if (!invalids[i] && senate.charAt(i) == 'D') {
                if (rRate > 0) {
                    invalids[i] = true;
                    invalidD++;
                }
                rRate--;
            }
            i++;
            i %= senate.length();
        }
    }
}
