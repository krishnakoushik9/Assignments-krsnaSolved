package krsnaSolved;

import java.util.Arrays;

/*
Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.
If `target` is not found in the array, return `[-1, -1]`.
You must write an algorithm with `O(log n)` runtime complexity.

**Example 1:**
**Input:** nums = [5,7,7,8,8,10], target = 8
**Output:** [3,4]

**Example 2:**
**Input:** nums = [5,7,7,8,8,10], target = 6
**Output:** [-1,-1]

**Example 3:**
**Input:** nums = [], target = 0
**Output:** [-1,-1]

 */
public class first_lastpostionarray {
    public static void main(String[] args) {
        int[] arr = {2,6,7,7,7,7,8,8,9};
        int target = 7;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] arr,int target) {
        int firstpos = -1;
        int lastpos = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;

            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else if(target == arr[mid] ){
                firstpos = mid;
                end = mid - 1;
            }
        }
        start = 0;
        end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else if(target == arr[mid]){
                lastpos = mid;
                start = mid + 1;
            }
        }return new int[]{firstpos,lastpos};
    }
}