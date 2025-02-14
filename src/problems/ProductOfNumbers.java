package problems;

public class ProductOfNumbers {
    private final int[] numbers;
    private final int[] zeroes;
    private int index;

    public ProductOfNumbers() {
        index = 0;
        numbers = new int[40000];
        zeroes = new int[40000];
    }

    public void add(int num) {
        if (index == 0) {
            numbers[index] = num;
            zeroes[index + 1] = num == 0 ? 1 : 0;
        } else {
            numbers[index] = numbers[index - 1] == 0 ? num : numbers[index - 1] * num;
            zeroes[index + 1] = num == 0 ? (zeroes[index] + 1) : zeroes[index];
        }
        index++;
    }

    public int getProduct(int k) {
        if (zeroes[index - 1] - zeroes[index - k] != 0) {
            return 0;
        }
        if (index == k) return numbers[index - 1];
        if (numbers[index - k - 1] == 0) return numbers[index - 1];
        return numbers[index - 1] / numbers[index - k - 1];
    }
}