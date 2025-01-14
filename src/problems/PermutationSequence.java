package problems;

public class PermutationSequence {
    private PermutationSequence() {
    }

    public static String getPermutation(int n, int k) {

        int[] arr = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320};
        boolean[] used = new boolean[n];
        StringBuilder result = new StringBuilder();

        k--;
        for (int i = 1; i <= n; i++) {
            int index = (k / arr[n - i]);
            k %= arr[n - i];

            result.append(isValid(index, used));
        }

        return result.toString();
    }

    private static String isValid(int index, boolean[] used) {
        int count = 0;
        for (int j = 0; j < used.length; j++) {
            if (!used[j]) {
                if (count == index) {
                    used[j] = true;
                    return String.valueOf(j + 1);
                }
                count++;
            }
        }
        return "";
    }
}
