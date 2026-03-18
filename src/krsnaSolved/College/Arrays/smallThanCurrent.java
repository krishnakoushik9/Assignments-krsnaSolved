package krsnaSolved.College.Arrays;
import java.util.Arrays;
public class smallThanCurrent {
    public static void main(String[] args) {
        int[] arr = {8,5,1,2,3,2,1,9};
        System.out.println(Arrays.toString(howManyCount(arr)));
    }
    public static int[] howManyCount(int[] arr){
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            int count = 0;
            for (int k : arr) {
                if (k < arr[i]) count++;
            }
            res[i] = count;
        }
        return res;
    }
}
