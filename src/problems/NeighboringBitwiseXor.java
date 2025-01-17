package problems;

public class NeighboringBitwiseXor {

    private NeighboringBitwiseXor() {
    }

    public static boolean doesValidArrayExist(int[] derived) {
        int result = 0;
        for(int i : derived) {
            result += i;
        }
        return result % 2 == 0;
    }
}
