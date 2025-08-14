package krsnaSolved;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question191 {
    public static void main(String[] args) {
        int ans = hammingWeight(10);
        System.out.println(ans);
    }
    public static int hammingWeight(int n) {
        List<Integer> remainders = new ArrayList<>();
        while(n != 0){
            int remainder = n % 2;
            remainders.add(remainder);
            n = n/2;
        }
        Collections.reverse(remainders);
        int count = 0;
        for (Integer remainder : remainders) {
            if (remainder == 1) {
                count++;
            }
        }
        return count;
    }
}
