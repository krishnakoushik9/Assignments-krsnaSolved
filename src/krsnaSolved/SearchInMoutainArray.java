package krsnaSolved;

public class SearchInMoutainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,5,4,1,0};
        //Find the Peak largest value in the array list
        int target = 4;
        System.out.println(search(arr,target));
        //our answer is index:1
    }

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderChecker(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }return orderChecker(arr,target,peak+1,arr.length-1);

    }

    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                //we are in descending part of answer so may be the answer
                end = mid;
            }
            else{
                //we are in ascending part of the array
                start = mid + 1;
            }
            //start == end {so it means that is the maximum element in each case checks above}
        }return start;
    }
    static int orderChecker(int[] arr, int target,int start,int end){
        //Find whether the Array is ascending or descending
        boolean isAscending = arr[start]<arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if(isAscending){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }
            else {
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }
        }return -1;
    }
}
