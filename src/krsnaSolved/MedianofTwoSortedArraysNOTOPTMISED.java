package krsnaSolved;

public class MedianofTwoSortedArraysNOTOPTMISED {
    public static void main(String[] args) {
        int[] arr1 = {1,2,5};
        int[] arr2 = {3,4,9};
        int[] merged = findMedianSortedArrays(arr1, arr2);
        sort(merged);
        double ans = mid(merged);
        System.out.println(ans);
    }
    public static int[] findMedianSortedArrays(int[] arr1,int[] arr2){
        //let's sort it here
        int[] result = new int[arr1.length + arr2.length];
        for(int i = 0;i< arr1.length;i++) {
            result[i] = arr1[i];
        }
        //Needs to be optimised
        for(int i = 0;i< arr2.length;i++){
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }
    public static void sort (int[] result){
        for(int i = 0;i<result.length - 1;i++){
            for(int j = 0;j < result.length - i - 1;j++){
                if (result[j] > result[j+1]){
                    swap(result,j,j+1);
                }
            }
        }
    }
    public static void swap(int[] result,int a,int b){
        int temp = result[a];
        result[a] = result[b];
        result[b] = temp;
    }
    public static double mid(int[] result){
        int n = result.length;
        if (n % 2 == 0) {
            return (result[n / 2] + result[n / 2 - 1]) / 2.0;
        } else {
            return result[n / 2];
        }
    }
}
