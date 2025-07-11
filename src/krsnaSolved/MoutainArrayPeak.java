package krsnaSolved;

public class MoutainArrayPeak {
    //Bitonic Array
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        //Find the Peak largest value in the array list
        System.out.println(peakIndexInMountainArray(arr));
        //our answer is index:1
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
}
