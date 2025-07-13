package krsnaSolved;

public class FindMissingPositive {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);

    }
    public static int firstMissingPositive(int[] arr){
        int i = 0;
        int n = arr.length;
        while(i < n){
            int correct = arr[i]-1;
            if(arr[i] > 0 && arr[i]<= n && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int index = 0;index< arr.length;index++){
            if(arr[index] != index + 1){
                return index + 1;
            }
        }
        return arr.length + 1;
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
