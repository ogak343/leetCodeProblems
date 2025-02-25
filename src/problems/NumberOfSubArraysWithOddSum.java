package problems;

public class NumberOfSubArraysWithOddSum {

    private NumberOfSubArraysWithOddSum() {
    }

    public static int numOfSubArrays(int[] arr) {
        int odd = 0;
        int even = 1;
        int sum = 0;
        int result = 0;
        for (int num : arr) {
            sum += num;
            if (sum % 2 == 1) {
                result = (result + even) % 1000000007;
                odd++;
            } else {
                result = (result + odd) % 1000000007;
                even++;
            }
        }
        return result;
    }
}
