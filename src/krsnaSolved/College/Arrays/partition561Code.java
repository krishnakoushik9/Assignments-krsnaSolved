package krsnaSolved.College.Arrays;

import java.util.Arrays;

public class partition561Code {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        System.out.println(arrayPartition(arr));
    }
    public static int arrayPartition(int[] arr){
        int added = 0;
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i=i+2){
            added = added + arr[i];
        }
        return added;
    }
}
