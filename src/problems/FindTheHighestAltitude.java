package problems;

public class FindTheHighestAltitude {

    private FindTheHighestAltitude() {
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int sub = 0;
        for (int num : gain) {
            sub += num;
            if (sub > max) max = sub;
        }
        return max;
    }
}
