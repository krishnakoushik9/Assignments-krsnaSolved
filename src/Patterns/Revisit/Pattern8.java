package Patterns.Revisit;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of rows
        int s = sc.nextInt(); // starting number
        patternEight(n, s);
        sc.close();
    }

    public static void patternEight(int n, int s) {
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print("  ");
            }
            int numCount = n - row;
            for (int col = 0; col < numCount; col++) {
                if (row == 0 || col == 0 || col == numCount - 1) {
                    System.out.print((s + col) + " ");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }
}
