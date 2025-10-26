package krsnaSolved;

public class minheap {
    public static void main(String[] args) {
        int[] ans = {6,7,3,1,2,8,4};
        System.out.println(checkMinHeap(ans));
    }
    public static boolean checkMinHeap(int[] arr){
        int n = arr.length;
        for(int i = 0;i<(n/2)+1;i++){
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            if(leftChild < n && arr[i] > arr[leftChild] ||rightChild < n && arr[i] > arr[rightChild]){
                return false;
            }
        }
        return true;
    }

}
