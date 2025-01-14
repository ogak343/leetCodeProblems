package problems;

public class Candy {

    private Candy(){
    }

    public static int candy(int[] ratings) {

        int index = 0;
        int previous = -1;
        Integer[] result = new Integer[4];
        result[0] = 1; // minValue
        result[1] = 0; // intervalEndIndex
        result[2] = 0; // intervalStartIndex
        result[3] = 0; // sum

        while (index < ratings.length -1) {
            if (ratings[index] > previous) {
                result[0] = Math.max(0, result[0]);
                result[3]+=result[0];
                index++;
            }
            if (index != ratings.length - 1) {
                if (ratings[index] > ratings[index + 1]) {
                    result[1] = index;
                    calculateFront(result, ratings);
                    index = result[2];
                }
            }
        }
        return result[3];
    }


    private static void calculateFront(Integer[] result, int[] ratings) {
        var start = result[1];
        for (int i = start; i < ratings.length - 1; i++) {
            if (ratings[i] > ratings[i+1]) {
                result[0]++;
            } else if (ratings[i] < ratings[i+1]) {
                result[2]++;
                break;
            }
            result[2]++;
            result[3]+=result[0];
        }
    }
}
