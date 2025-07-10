package krsnaSolved;
public class Ceilingoftargetvalue {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 6;
        int ans = searchInsert(arr,target);
        System.out.println(ans);
    }
    public static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        if (start <= arr.length - 1) {
            return arr[start];
        }
        return -1;
    }
}
