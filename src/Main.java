import problems.GreatestCommonDivisorOfStrings;
import problems.KidsWithTheGreatestNumberOfCandies;
import problems.MergeStringsAlternately;

public class Main {

    public static void main(String[] args) {

        int[] candies = new int[]{2,3,5,1,3};
        int extraCandy = 3;
        System.out.println(KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandy));
    }
}