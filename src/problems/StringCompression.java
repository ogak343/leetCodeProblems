package problems;

public class StringCompression {
    private StringCompression() {
    }

    public static int compress(char[] chars) {
        int count = 0;
        char previous = ' ';
        int leftIndex = 0;
        int rightIndex = 0;
        while (rightIndex < chars.length) {
            if (chars[rightIndex] == previous) {
                count++;
            } else {
                if (count > 1) {
                    String count1 = String.valueOf(count);
                    for (int i = 0; i < count1.length(); i++) {
                        chars[leftIndex] = count1.charAt(i);
                        leftIndex++;
                    }
                }
                chars[leftIndex] = chars[rightIndex];
                previous = chars[rightIndex];
                count = 1;
                leftIndex++;
            }
            rightIndex++;
        }
        if (rightIndex == chars.length && count > 1) {
                String count1 = String.valueOf(count);
                for (int i = 0; i < count1.length(); i++) {
                    chars[leftIndex] = count1.charAt(i);
                    leftIndex++;
                }
            }

        return leftIndex;
    }
}
