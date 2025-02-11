package problems;

public class GreatestCommonDivisorOfStrings {
    private GreatestCommonDivisorOfStrings() {
    }

    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        return str1.substring(0 , calculateGCD(str1.length(), str2.length()));
    }

    private static int calculateGCD(int a, int b) {
        return b == 0 ? a : calculateGCD(b, a % b);
    }
}
