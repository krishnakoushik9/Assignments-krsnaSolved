package krsnaSolved;

public class OptimisedEvenNumbers {
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
            if (num == 0) continue; // edge case: 0 has 1 digit (odd)
            int digits = (int) Math.log10(num) + 1;
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
