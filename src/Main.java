import problems.LetterTilePossibilities;
import problems.LongestSubarrayOf1sAfterDeletingOneElement;
import problems.MaxConsecutiveOnes3;
import problems.MaximumAverageSubarray1;
import problems.MaximumNumberOfVowelsInASubstringOfGivenLength;
import problems.Permutations2;

public class Main {

    public static void main(String[] args) {

        int[] input = new int[]{0,1,1,1,0,1,1,0,1};
        int k = 2;
        System.out.println(LongestSubarrayOf1sAfterDeletingOneElement.longestSubarray(input));
    }
}