package RecursionBased;

import java.util.Arrays;

public class MergeSortKK {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int middle = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,middle));
        int[] right = mergesort(Arrays.copyOfRange(arr,middle,arr.length));

        return merger(left,right);
    }

    private static int[] merger(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i< left.length && j< right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }
            else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        return mix;
    }

}
