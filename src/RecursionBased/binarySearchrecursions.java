package RecursionBased;

public class binarySearchrecursions {
    public static void main(String[] args) {
        int[] arr = {2,4,5,12,34,56,87,99,102};
        int target = 2;
        int ans = search(arr,target,0, arr.length - 1);
        System.out.println(ans);
    }
    public static int search(int[] arr,int target,int s,int e){
        if(s > e){
            return - 1;
        }
        int mid = s + (e - s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            return search(arr,target,s,mid-1);
        }
            return search(arr,target,mid + 1,e);
    }
}
