package krsnaSolved;
import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {7,2,82,42,12,57,92,24,38,1};
        staticResponce(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void staticResponce(int[] arr) {
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}


