package krsnaSolved;

public class optimisedpwr2 {
    public static void main(String[] args) {
        int n = 16;
        boolean ans = isPowerofTwo(n);
        System.out.println(ans);
    }
    private static boolean isPowerofTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
