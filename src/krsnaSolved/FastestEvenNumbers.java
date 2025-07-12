package krsnaSolved;

public class FastestEvenNumbers {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] arr = {18, 124, 9, 1764, 98, 1};
        System.out.println(countEvenDigitNumbers(arr));
        long end = System.nanoTime();
        System.out.println("Time taken (ms): " + (end - start) / 1_000_000.0);
    }

    static int countEvenDigitNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
