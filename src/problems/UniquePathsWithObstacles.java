package problems;

public class UniquePathsWithObstacles {

    private UniquePathsWithObstacles(){
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid, int indexX, int indexY, int[][] val) {
        if (obstacleGrid[0][0] == 1) return 0;

        if (indexX < obstacleGrid.length - 1) {
            if (val[indexX + 1][indexY] != -1 && obstacleGrid[indexX + 1][indexY] != 1) {
                if (val[indexX + 1][indexY] == 0) {
                    val[indexX][indexY] += uniquePathsWithObstacles(obstacleGrid, indexX + 1, indexY, val);
                } else {
                    val[indexX][indexY] += val[indexX + 1][indexY];
                }
            }
        }

        if (indexY < obstacleGrid[0].length - 1) {
            if (val[indexX][indexY + 1] != -1 && obstacleGrid[indexX][indexY + 1] != 1) {
                if (val[indexX][indexY + 1] == 0) {
                    val[indexX][indexY] += uniquePathsWithObstacles(obstacleGrid, indexX, indexY + 1, val);
                } else {
                    val[indexX][indexY] += val[indexX][indexY + 1];
                }
            }
        }
        if (indexX == obstacleGrid.length - 1 && indexY == obstacleGrid[0].length - 1) {
            val[indexX][indexY] = 1;
            return 1;
        }
        if (indexX == 0 && indexY == 0) {
            return val[indexX][indexY];
        }

        if (val[indexX][indexY] == 0) {
            val[indexX][indexY] = -1;
        }

        return val[indexX][indexY] == -1 ? 0 : val[indexX][indexY];
    }
}
