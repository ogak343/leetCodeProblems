package problems;

public class PlusOne {
    private PlusOne() {
    }

    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        boolean hasIncrement = (digits[index] + 1) > 9;
        digits[index] = (digits[index] + 1) % 10;
        index--;
        while (index >= 0) {
            if (hasIncrement) {
                hasIncrement = (digits[index] + 1) > 9;
                digits[index] = (digits[index] + 1) % 10;
                index--;
            } else {
                break;
            }
        }
        if (hasIncrement) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
        return digits;
    }
}
