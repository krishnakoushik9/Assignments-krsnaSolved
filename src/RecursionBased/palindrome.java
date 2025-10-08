package RecursionBased;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(reverseChecker(7667));
    }

    static boolean reverseChecker(int n) {
        return n == reverseNumber(n, 0);
    }

    // Recursive helper to reverse a number
    static int reverseNumber(int n, int rev) {
        if (n == 0)
            return rev;
        return reverseNumber(n / 10, rev * 10 + n % 10);
    }
}
