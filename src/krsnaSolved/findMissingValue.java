package krsnaSolved;

public class findMissingValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
        public static int missingNumber(int[] arr){
            int i = 0;
            int n = arr.length;
            while(i < n){
                int correct = arr[i];
                if(arr[i]< n && arr[i] != arr[correct]){
                    swap(arr,i,correct);
                }else{
                    i++;
                }
            }
            for (int j = arr[0];j < n;j++){
                if(arr[j]!=j){
                    return j;
                }
            }return n;
        }
        public static void swap(int[] arr, int a, int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
}
