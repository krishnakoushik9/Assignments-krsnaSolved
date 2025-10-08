package krsnaSolved;

public class Q287Leet {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }
    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        int low = 1;
        int high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int lessOrEqual = 0;
            for (int num : nums) {
                if (num <= mid) {
                    lessOrEqual++;
                }
            }
            if (lessOrEqual <= mid) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
