package problems;

public class SearchA2DMatrix {

    private SearchA2DMatrix() {
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int x = matrix.length - 1;
        int y = 0;

        while (true) {
            if (matrix[x][y] == target) {
                return true;
            }
            if (matrix[x][y] > target) {
                x--;
            } else {
                y++;
            }
            if (x < 0 || y > matrix[0].length - 1) {
                return false;
            }
        }
    }
}
