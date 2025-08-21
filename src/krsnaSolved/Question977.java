package krsnaSolved;

import java.util.ArrayList;

public class Question977 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 4, 6, 9};
        ArrayList<Integer> ans = sortedSquares(nums);
        ArrayList<Integer> ascendingAns = reversedOrder(ans);
        System.out.println(ascendingAns);
    }

    public static ArrayList<Integer> sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        ArrayList<Integer> result = new ArrayList<>();
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result.add(nums[left] * nums[left]);
                left += 1;
            } else {
                result.add(nums[right] * nums[right]);
                right -= 1;
            }
        }
        return result;
    }

    public static ArrayList<Integer> reversedOrder(ArrayList<Integer> result) {
        ArrayList<Integer> reversed = new ArrayList<>();
        for (int i = result.size() - 1; i >= 0; i--) {
            reversed.add(result.get(i));
        }
        return reversed;
    }
}
