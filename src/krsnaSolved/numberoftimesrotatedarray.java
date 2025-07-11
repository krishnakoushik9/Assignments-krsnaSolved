package krsnaSolved;

public class numberoftimesrotatedarray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7,0,1,2,3};
        int ans = findPivot(arr);
        int n = ans + 1;
        System.out.println(n);
    }
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start]<=arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }return -1;
    }
}
