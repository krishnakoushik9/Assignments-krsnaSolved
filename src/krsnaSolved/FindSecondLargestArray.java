package krsnaSolved;

public class FindSecondLargestArray {
    public static void main(String[] args) {
        int[] arr = {1,9,18,3,24,3};
        int ans = getSecondLargest(arr);
        System.out.println(ans);
    }
    public static int getSecondLargest(int[] arr){
        int max = -1;
        int secondMax = -1;
        for(int num : arr){
            if(num > max){
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
