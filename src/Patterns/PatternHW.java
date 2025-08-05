package Patterns;

public class PatternHW {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for centering the row (pyramid effect)
            System.out.print(" ".repeat(n - i));
            // Print numbers for this row, separated by a space
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
