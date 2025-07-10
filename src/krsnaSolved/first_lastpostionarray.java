package krsnaSolved;

import java.util.Arrays;

public class first_lastpostionarray {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 2;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] arr, int target){
        int start = 0;
        int firstpos = -1;
        int lastpos = -1;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else if(arr[mid] == target) {
                firstpos = mid;
                end = mid -1;
            }
        }
        start = 0;
        end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else if(arr[mid] == target) {
                lastpos = mid;
                start = mid + 1;
            }
            if (firstpos == -1 || lastpos == -1) {
                return new int[]{-1, -1};
            }
        }return new int[]{firstpos,lastpos};
    }
}
