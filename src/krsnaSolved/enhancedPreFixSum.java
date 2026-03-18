package krsnaSolved;

import java.util.Arrays;

public class enhancedPreFixSum {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,5};
        System.out.println(Arrays.toString(makePrefixSum(arr,2)));
    }
    public static int[] makePrefixSum(int[] arr,int k){
        int n = arr.length;
        for (int i = 1;i<n;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
}
