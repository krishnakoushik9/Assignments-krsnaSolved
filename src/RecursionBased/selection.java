package RecursionBased;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        System.out.println("Selection Sorting");
        int[] arr = {7,1,3,9,4,2,10,86};
        selectionSort(arr, arr.length - 1, 0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr , int r,int c,int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                    selectionSort(arr,r,c+1,c);
            }
            else{
                selectionSort(arr,r,c+1,max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr,r-1,0,0);
        }
    }
}
