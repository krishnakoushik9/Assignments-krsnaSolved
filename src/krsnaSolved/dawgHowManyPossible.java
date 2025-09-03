package krsnaSolved;

public class dawgHowManyPossible {
    public static void main(String[] args) {
        String s = "abcd";
        String ans = noOfWays(s);
        System.out.println(ans);
    }
    public static String noOfWays(String s) {
        int n = s.length();
        String t = null;
        for (int i = 0; i < Math.pow(2, n - 1); i++) {
            int k = 1;
            t = "";
            for (int j = 0; j < n; j++) {
                if ((k & (1 << j)) != 0) {
                    t = t + s.charAt(j);
                }
            }
        }
        return s;
    }
}
