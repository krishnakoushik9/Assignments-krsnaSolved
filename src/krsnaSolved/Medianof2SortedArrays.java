package krsnaSolved;

import java.util.Arrays;

public class Medianof2SortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,4,5};
        int[] arr2 = {7,9,12,15};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }

    private static int[] findMedianSortedArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        Arrays.sort(arr3);
        return arr3;
    }
    

}
