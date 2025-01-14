package problems;

public class AddBinary {

    private AddBinary() {
    }

    public static String addBinary(String a, String b) {
        int s1 = 0;
        int s2 = 0;
        int index2 = b.length() - 1;
        int index1 = a.length() - 1;
        int overlap = 0;
        String res = "";
        while (index2 >= 0 || index1 >= 0) {
            if (index1 < 0) {
                s1 = 0;
            } else {
                s1 = a.charAt(index1) - '0';
                index1--;
            }
            if (index2 < 0) {
                s2 = 0;
            } else {
                s2 = b.charAt(index2) - '0';
                index2--;
            }
            res = ((overlap + s1 + s2) % 2) + res;
            overlap = ((overlap + s1 + s2) / 2);
        }
        res = overlap == 0 ? res : overlap + res;
        return res;
    }
}
