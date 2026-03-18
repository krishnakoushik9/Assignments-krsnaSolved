package krsnaSolved.College.Arrays;

import java.util.Arrays;

public class concate1D {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(con1D(arr)));
    }
    public static int[] con1D(int[] arr){
        int n = arr.length;
        int[] newArr = new int[2 * n];
        for(int i = 0;i<n;i++){
            newArr[i] = arr[i];
            newArr[i+n] = arr[i];
        }
        return newArr;
    }
}
