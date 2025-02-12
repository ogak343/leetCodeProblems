package problems;

public class CanPlaceFlowers {
    private CanPlaceFlowers() {
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        byte valid = 1;

        for (int j : flowerbed) {
            if (valid == 0 && j == 0) {
                valid = 1;
            } else if (valid == 0 && j == 1) {
                n++;
            } else if (valid == 1 && j == 1) {
                valid = 0;
            } else {
                n--;
                valid = 0;
            }
        }
        return n <= 0;
    }
}
