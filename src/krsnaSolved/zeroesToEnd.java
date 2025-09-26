package krsnaSolved;

import java.util.Arrays;

public class zeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {2,3,0,4,-1,0,9,7,0,0};
        System.out.println(Arrays.toString(pushZeroesToEnd(arr)));
    }
    public static int[] pushZeroesToEnd(int[] arr){
        int count = 0;
            for(int i = 0;i<arr.length;i++){
                if(arr[i] != 0){
                    swap(arr,i,count);
                    count += 1;
                }
            }
        return arr;
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
