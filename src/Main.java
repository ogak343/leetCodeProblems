import problems.FindThePunishmentNumberOfAnInteger;
import problems.MaxNumberOfKSumPairs;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{3,1,3,4,3};
        int k = 6;
        System.out.println(MaxNumberOfKSumPairs.maxOperations(nums, k));
    }
}