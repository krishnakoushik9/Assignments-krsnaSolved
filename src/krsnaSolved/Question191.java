package krsnaSolved;

public class Question191 {
    public static void main(String[] args) {
        int ans = hammingWeight(10);
        System.out.println(ans);
    }
    public static int hammingWeight(int n) {
        int count = 0 ;
        while(n != 0 ) {
            if((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }
}
