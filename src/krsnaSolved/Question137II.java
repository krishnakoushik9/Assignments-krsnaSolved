package krsnaSolved;

public class Question137II {
    public static void main(String[] args) {
        int[] n = {6,6,6,2,3,3,3};
        System.out.println(singleNumber(n));
    }
    public static int singleNumber(int[] n) {
        int o = 0, t = 0;
        for (int x : n) { o = (o ^ x) & ~t; t = (t ^ x) & ~o; }
        return o;
    }
}
