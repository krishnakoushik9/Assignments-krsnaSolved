package krsnaSolved;

public class SearchinsideRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 7;

        int result = search(arr, target);
        System.out.println(result);
    }
    public static int search(int[]arr,int target){
        int pivot = findPivot(arr);
        if(pivot == -1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot);
        }
        else{
            return binarySearch(arr,target,pivot+1,arr.length-1);
        }

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

    public static int binarySearch(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }return -1;
    }
}