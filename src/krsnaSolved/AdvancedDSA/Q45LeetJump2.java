package krsnaSolved.AdvancedDSA;

public class Q45LeetJump2 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,1,3,4,7,1,3};
        System.out.println(jumperHelper(arr));
    }
    public static int jumperHelper(int[] arr){
        int jumperLocation = 0;
        int n = arr.length;
        int howFarReach = 0;
        int totalJumps = 0;
        int destinationElement = n - 1;
        if(n == 1){
            return 0;
        }
        for(int i = 0;i<n;i++){
            howFarReach = Math.max(howFarReach,i+arr[i]);
            if(i == jumperLocation){
                jumperLocation = howFarReach;
                totalJumps++;
                if(howFarReach >= destinationElement){
                    return totalJumps;
                }
            }
        }
        return totalJumps;
    }
}