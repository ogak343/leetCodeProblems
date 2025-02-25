package problems;

public class FindUniqueBinaryString {
    private FindUniqueBinaryString() {
    }

    public static String findDifferentBinaryString(String[] nums) {
        char[] chars = new char[nums.length];
        for (int i = 0; i < nums.length; i++) {
            chars[i] = nums[i].charAt(i) == '1' ? '0' : '1';
        }
        return new String(chars);

    }
}
