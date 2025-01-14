package problems;

public class RotateImage {

    private RotateImage() {
    }

    public static void rotate(int[][] matrix) {

        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            iterate(matrix, i, n);
        }
        if (n % 2 == 1) {
            int j = n / 2;
            iterate(matrix, j, n);
        }
    }

    private static void iterate(int[][] matrix, int i, int n) {
        for (int j = 0; j < n / 2; j++) {
            int val = matrix[i][j];
            matrix[i][j] = matrix[n - 1 - j][i];
            matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
            matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
            matrix[j][n - 1 - i] = val;
        }
    }
}
