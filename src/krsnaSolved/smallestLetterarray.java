package krsnaSolved;

public class smallestLetterarray {
    public static void main(String[] args) {
        char[] arr = {'a','c','g','k','o'};
        char target = 'o';
        char ans = nextGreatestLetter(arr,target);
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] arr, int target) {
        int start = 0;
        //We are only returning index of the values we need here different from Ceiling
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }

}
