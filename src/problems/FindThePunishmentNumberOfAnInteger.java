package problems;


public class FindThePunishmentNumberOfAnInteger {
    private FindThePunishmentNumberOfAnInteger() {
    }

    public static int punishmentNumber(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += backTract(String.valueOf(i * i), 0, i, 0) ? i * i : 0;
        }
        return result;
    }

    private static boolean backTract(String string, int i, int expected, int current) {

        if (i == string.length() && expected == current) {
            return true;
        }
        int num = 0;
        for (int j = i; j < string.length(); j++) {
            num = num * 10 + (string.charAt(j) - '0');
            if (backTract(string, j + 1, expected, current + num)) {
                return true;
            }
        }
        return false;
    }
}
