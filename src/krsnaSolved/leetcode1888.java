package krsnaSolved;

public class leetcode1888 {
    public static void main(String[] args) {
        String s = "010101100";
        System.out.println(minFlips(s));
    }
    public static int minFlips(String s) {
        int flip1 = 0;
        int flip2 = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i % 2 == 0 && ch != '1') {
                flip1++;
            }
            if (i % 2 != 0 && ch != '0') {
                flip1++;
            }
            if (i % 2 == 0 && ch != '0') {
                flip2++;
            }
            if (i % 2 != 0 && ch != '1') {
                flip2++;
            }
        }
        return Math.min(flip1, flip2);
    }
}
