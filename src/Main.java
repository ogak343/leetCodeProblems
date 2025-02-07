import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] input = new int[]{3,3};
//        System.out.println(convert("[[1,4],[2,5],[1,3],[3,4]]"));

        System.out.println(Arrays.toString(input));
    }

    public static String convert(String string) {
        return string.replace("[", "{").replace("]", "}");
    }
}