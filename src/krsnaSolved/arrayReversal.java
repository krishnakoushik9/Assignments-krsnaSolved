package krsnaSolved;

import java.util.Arrays;

public class arrayReversal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] ans = arrayReversalMethod(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] arrayReversalMethod(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // Swap characters
            if(arr[left] % 2 == 0 && arr[right] % 2 == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            left ++;
            right --;
        }
        return arr;
    }

}