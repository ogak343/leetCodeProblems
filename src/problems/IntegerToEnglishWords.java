package problems;

public class IntegerToEnglishWords {

    private IntegerToEnglishWords() {
    }

    public static String integerToWords(Integer num) {
        String result = "";
        if (num > 999999999) {
            result += (getOnes(num / 1000000000).isEmpty() ? "" : getOnes(num / 1000000000) + " Billion");
        }
        num %= 1000000000;
        result += (solve(num / 1000000).isEmpty() ? "" : solve(num / 1000000) + " Million");
        num %= 1000000;
        result += (solve(num / 1000).isEmpty() ? "" : solve(num / 1000) + " Thousand");
        num %= 1000;
        result += solve(num);
        return result;
    }

    public static String solve(int num) {

        String result = "";
        if ((num / 100) != 0) {
            result += (getOnes(num / 100).isEmpty() ? "" : getOnes(num / 100) + " Hundred");
        }
        num %= 100;
        if (num < 10 && num >= 1) {
            result += getOnes(num);
        } else if (num >= 10 && num < 20) {
            result += getTeens(num);
        } else if (num >= 20) {
            result += (get2xs(num / 10) + getOnes(num % 10));
        }
        return result;
    }

    private static String get2xs(int num) {
        return switch (num) {
            case 2 -> " Twenty";
            case 3 -> " Thirty";
            case 4 -> " Forty";
            case 5 -> " Fifty";
            case 6 -> " Sixty";
            case 7 -> " Seventy";
            case 8 -> " Eighty";
            case 9 -> " Ninety";
            default -> "0";
        };
    }

    private static String getTeens(int num) {
        return switch (num) {
            case 10 -> " Ten";
            case 11 -> " Eleven";
            case 12 -> " Twelve";
            case 13 -> " Thirteen";
            case 14 -> " Fourteen";
            case 15 -> " Fifteen";
            case 16 -> " Sixteen";
            case 17 -> " Seventeen";
            case 18 -> " Eighteen";
            case 19 -> " Nineteen";
            default -> "0";
        };
    }

    private static String getOnes(int num) {
        return switch (num) {
            case 0 -> "";
            case 1 -> " One";
            case 2 -> " Two";
            case 3 -> " Three";
            case 4 -> " Four";
            case 5 -> " Five";
            case 6 -> " Six";
            case 7 -> " Seven";
            case 8 -> " Eight";
            case 9 -> " Nine";
            default -> "0";
        };
    }

}
