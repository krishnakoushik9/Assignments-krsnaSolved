package krsnaSolved.College.Arrays;

import java.util.Arrays;

public class sumRun {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6};
        System.out.println(Arrays.toString(sumRun1D(nums)));
    }
    public static int[] sumRun1D(int[] arr){
        for (int i = 1;i<arr.length;i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
}
