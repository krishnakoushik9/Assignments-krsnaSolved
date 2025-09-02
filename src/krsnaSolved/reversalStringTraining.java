package krsnaSolved;

public class reversalStringTraining {
    public static void main(String[] args) {
        String s = "1232166";
        System.out.println(makePalindrome(s)); // 61232166
    }

    public static String makePalindrome(String s) {
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            if (isPalindrome(s, 0, i)) {
                String rev = "";
                for (int j = n - 1; j > i; j--) rev += s.charAt(j);
                return rev + s;
            }
        }
        return s;
    }

    private static boolean isPalindrome(String s, int l, int r) {
        while (l < r) if (s.charAt(l++) != s.charAt(r--)) return false;
        return true;
    }
}
