package problems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class UniquePath {
    private UniquePath(){
    }

    public static int uniquePaths(int m, int n) {
        List<BigInteger> comb = new ArrayList<>();
        if (m == 1 || n == 1) {
            return 1;
        }
        comb.add(BigInteger.valueOf(1));
        comb.add(BigInteger.valueOf(1));
        for (int i = 2; i < m + n - 1; i++) {
            comb.add(comb.get(i - 1).multiply(BigInteger.valueOf(i)));
        }
        return Integer.parseInt(comb.get(m + n - 2).divide(comb.get(m - 1).multiply(comb.get(n - 1))).toString());
    }
}
