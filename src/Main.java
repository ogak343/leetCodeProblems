
import problems.MoveZeroes;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] input = new int[]{0, 7, 0, 0, 3, 12};
        MoveZeroes.moveZeroes(input);
        System.out.println(Arrays.toString(input));
    }
}