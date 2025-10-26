package krsnaSolved;
import java.util.Arrays;

public class multiplier {
    public static void main(String[] args) {
        int[] arr = {7,6,3,-1,4,9};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int totalProduct = 1;
        int place = 0;

        for (int num : nums) {
            if (num == 0) {
                place++;
            } else {
                totalProduct *= num;
            }
        }
        for (int i = 0; i < n; i++) {
            if (place > 1) {
                result[i] = 0;
            } else if (place == 1) {
                if (nums[i] == 0) {
                    result[i] = totalProduct;
                } else {
                    result[i] = 0;
                }
            } else {
                result[i] = totalProduct / nums[i];
            }
        }
        return result;
    }
}