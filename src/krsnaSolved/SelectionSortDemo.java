package krsnaSolved;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] arr = {7, 2, 82, 42, 12, 57, 92, 24, 38, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for(int i = 0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j = i + 1;j<arr.length;j++)
            {
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
