package krsnaSolved;

public class preFixSum {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,1,1};
        int k = 2;
        System.out.println(retSubArray(arr,k));
    }
    public static int retSubArray(int[] arr,int k){
        int n = arr.length;
        int count = 0;
        for (int start = 0;start<n;start++){
            int sum = 0;
            for(int end = start;end<n;end++){
                sum = sum + arr[end];
                if(sum == k){
                    count ++;
                }
            }
        }
        return count;
    }
}
