package krsnaSolved;

import java.util.Arrays;

public class TwoSumSolution {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6,11,15};
        int target = 10;
        int[] ans = twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }return new int[]{-1,-1};
    }
}