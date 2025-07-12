package krsnaSolved;

public class findMissingValue {
    public static void main(String[] args) {
        int[] arr = {4,3,2,0};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
        public static int missingNumber(int[] arr){
            int i = 0;
            int n = arr.length;
            while(i < n){
                int correct = arr[i]-1;
                if(arr[i] >=1 && arr[i]<= n && arr[i] != arr[correct]){
                    swap(arr,i,correct);
                }else{
                    i++;
                }
            }
            for (int j = 0;j < n;j++){
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
