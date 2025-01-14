package problems;

public class HappyNumber {

    private HappyNumber(){
    }

    public static boolean isHappy(int n) {

        int current;
        while (n > 9) {
            current = 0;
            while (n > 0) {
                current += (n % 10) * (n % 10);
                n /= 10;
            }
            n = current;
        }
        return (n == 1) || (n == 7);
    }
}
