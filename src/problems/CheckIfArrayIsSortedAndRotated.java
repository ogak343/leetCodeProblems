package problems;

public class CheckIfArrayIsSortedAndRotated {
    private CheckIfArrayIsSortedAndRotated() {
    }

    public static boolean check(int[] nums) {
        int previous = nums[0];
        int biggest = nums[0];
        int smallest = nums[0];
        int counter = 0;
        for (int num : nums) {
            if (counter > 0 && (num > biggest || num > smallest)) return false;
            biggest = Math.max(biggest, num);
            if (num > previous) {
                previous = num;
            } else if (num < previous) {
                counter++;
                if (num > smallest) return false;
                previous = num;
            }
        }
        return counter < 2;
    }
}
