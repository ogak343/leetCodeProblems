package problems;

public class XorQueriesOfASubarray {

    private XorQueriesOfASubarray() {
    }

    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = calculateXor(arr, queries[i][0], queries[i][1]);
        }
        return result;
    }

    private static int calculateXor(int[] arr, int from, int to) {
        int initial = arr[from];
        int toX;
        for (int i = from; i < to; i++) {
            toX = arr[i + 1];
            initial = initial ^ toX;
        }
        return initial;
    }
}
