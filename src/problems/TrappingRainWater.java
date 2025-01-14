package problems;

public class TrappingRainWater {

    private TrappingRainWater() {
    }

    public static int trap(int[] height) {
        Integer[] result = new Integer[1];
        result[0] = 0;
        for (int start = 0; start < height.length - 1; start++) {

            int j = start + 1;
            int maxIndex = j;
            while (j< height.length) {
                if (height[maxIndex] < height[j]) {
                    maxIndex = j;
                }
                if (j == height.length - 1 && height[height.length - 1] < height[maxIndex]) {
                    calculateVolume(start, maxIndex, height, result);
                    start = maxIndex - 1;
                    break;
                }
                if (j == height.length - 1) {

                    calculateVolume(start, height.length - 1, height, result);
                    start = height.length - 1;
                    break;
                }
                if (height[j] >= height[start]) {
                    calculateVolume(start, j, height, result);
                    start = j - 1;
                    break;
                } else {
                    j++;
                }
            }
        }

        return result[0];
    }
    private static void calculateVolume(int start, int j, int[] height, Integer[] result) {
        int height1 = Math.min(height[start], height[j]);
        for (int s = start; s <= j; s++) {
            if (height1> height[s]) {
                result[0] += (height1 - height[s]);
            }
        }
    }
}
