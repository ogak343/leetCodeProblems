package problems;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    private SpiralMatrix() {
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int xIndex = 0;
        int yIndex = 0;
        int left = 0;
        int top = 0;
        int right = matrix.length - 1;
        int bottom = matrix[0].length - 1;
        int direction = 0;
        while (true) {
            if (direction == 0) {
                list.add(matrix[xIndex][yIndex]);
                if (yIndex != bottom) {
                    yIndex++;
                } else {
                    left++;
                    xIndex++;
                    direction = (direction + 1) % 4;
                }
            } else if (direction == 1) {
                list.add(matrix[xIndex][yIndex]);
                if (xIndex != right) {
                    xIndex++;
                } else {
                    bottom--;
                    yIndex--;
                    direction = (direction + 1) % 4;
                }
            } else if (direction == 2) {
                list.add(matrix[xIndex][yIndex]);
                if (yIndex != top) {
                    yIndex--;
                } else {
                    right--;
                    xIndex--;
                    direction = (direction + 1) % 4;
                }
            } else if (direction == 3) {
                list.add(matrix[xIndex][yIndex]);
                if (xIndex != left) {
                    xIndex--;
                } else {
                    top++;
                    yIndex++;
                    direction = 0;
                }
            }
            if (list.size() == matrix.length * matrix[0].length) {
                return list;
            }
        }
    }
}
