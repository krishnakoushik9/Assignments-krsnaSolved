package krsnaSolved;

public class numberofrotationwithduplicates {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6,7,8,9,0,0, 1,1,1,2,2};

        int result = findPivotDuplicate(arr);
        System.out.println(result+1);
    }
    public static int findPivotDuplicate(int[] arr){
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
            //Below will conflict with Duplicate elements
            /*if(arr[start]<=arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }*/
            //Now we wanna make sure it skips the duplicates
            if(arr[mid]==arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start+1]){
                    return start;
                }start++;
                if(arr[end] < arr[end - 1]){
                    return end;
                }
                end --;
            }
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid]>arr[end]){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}

