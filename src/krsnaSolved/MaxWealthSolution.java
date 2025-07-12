package krsnaSolved;

import java.util.Scanner;

public class MaxWealthSolution {
    public static void main(String[] args) {
        // Version 2: Matrix size and contents are dynamically input by the user
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(); // number of customers (rows)
        int n = scanner.nextInt(); // number of banks (columns)
        int[][] arr = new int[m][n];

        // Input: user provides matrix values
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int result = maximumWealth(arr);
        System.out.println(result);  // Only final output: max wealth
    }

    static int maximumWealth(int[][] arr) {
        int max = 0;
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
