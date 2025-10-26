package RecursionBased;

public class findTarget {
    public static void main(String[] args) {
        int[] arr = {5,7,4,1,9,11,2};
        int ans = (recursionTargetFindLinear(arr,4,0));
        System.out.println(ans);
    }
    public static int recursionTargetFindLinear(int[] arr,int target,int index){
        if (index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return recursionTargetFindLinear(arr,target,index+1);
        }
    }
}
