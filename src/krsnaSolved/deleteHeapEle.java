package krsnaSolved;

public class deleteHeapEle {
    public static void main(String[] args) {
        int[] heap = {10, 5, 3, 2, 4};
        int n = heap.length;
        n = deleteHeap(heap, n);
        for(int i = 0; i < n; i++) System.out.print(heap[i] + " ");
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i, l = 2*i + 1, r = 2*i + 2;
        if(l < n && arr[l] > arr[largest]) largest = l;
        if(r < n && arr[r] > arr[largest]) largest = r;
        if(largest != i) {
            int t = arr[i]; arr[i] = arr[largest]; arr[largest] = t;
            heapify(arr, n, largest);
        }
    }

    public static void createHeap(int[] arr,int n){
        for(int i = (n/2) - 1;i>=0;i--){

        }
    }

    public static int deleteHeap(int[] arr, int n) {
        arr[0] = arr[n-1];
        n--;
        heapify(arr, n, 0);
        return n;
    }
}
