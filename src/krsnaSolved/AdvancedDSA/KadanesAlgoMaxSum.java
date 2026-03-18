package krsnaSolved.AdvancedDSA;

public class KadanesAlgoMaxSum {
    public static void main(String[] args) {
        int[] nums = {-1,-4,6,7,-12,3,-9,5,6,-9,2,3};
        System.out.println(maxSum(nums));
    }
    public static int maxSum(int[] nums){
        int maxi = nums[0];
        int currentSum = nums[0];
        for(int i = 1;i<nums.length;i++){
            currentSum = Math.max(nums[i],currentSum + nums[i]);
            maxi = Math.max(maxi,currentSum);
        }
        return maxi;
    }
}
