package krsnaSolved.AdvancedDSA;

import krsnaSolved.InterfaceRelated;

import java.util.ArrayList;
import java.util.Arrays;

public class Q179Leet {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }
    public static String largestNumber(int[] nums) {
        int n = nums.length;
        String[] arr = new String[n];
        for(int i = 0; i < nums.length; i++){
            arr[i] = (String.valueOf(nums[i]));
        }
        if (arr[0].equals("0")) {
            return "0";
        }
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j< arr.length;j++){
                String s1 = arr[i] + arr[j];
                String s2 = arr[j] + arr[i];
                if (s1.compareTo(s2) < 0) {
                swap(arr,i,j);
                }
            }
        }
        return String.join("", arr);
    }
    public static void swap(String[] arr,int i,int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
