package problems;

public class StringToInteger {

    private StringToInteger(){
    }

    public static int myAtoi(String s) {
        boolean negative = s.contains("-");
        s = s.replace(" ", "");
        s = s.replace("-", "");
        String updated = s.replaceAll("\\D.*", "");
        if (updated.isEmpty()) {
            return 0;
        }

        long result = Long.parseLong(updated);
        if (negative && result > 2147483648L) {
            result = 2147483648L;
        }
        if (!negative && result > 2147483647L) {
            result = 2147483647L;
        }
        if(negative) {
            return (int) -result;
        } else{
            return (int) result;
        }
    }
}
