package krsnaSolved;

import java.util.Arrays;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,12,23,35,44,51,67,88,91,99};
        int target = 51;
        System.out.println(range(arr,target));
    }

    static int range(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (true) {
            try {
                if (target <= arr[end]) break;
                int new_start = end + 1;
                end = end + (end - start + 1) * 2;
                start = new_start;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Simulate: We've hit the "end" of our infinite world
                break;
            }
        }
        return infiniteArray(arr, target, start, end);
    }

    static int infiniteArray(int[] arr,int target,int start,int end){

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else {
                return mid;
            }
        }return -1;
    }
}
