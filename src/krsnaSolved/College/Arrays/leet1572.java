package krsnaSolved.College.Arrays;

public class leet1572 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,5},
                {5,3,6},
                {9,2,8}
        };
        System.out.println(diagonalSum(arr));
    }
    public static int diagonalSum(int[][] arr){
        int sum = 0;
        int start = 0;
        int end = arr.length-1;
        for(int i = 0;i<arr.length;i++){
            if(start == end){
                sum = sum - arr[i][start];
            }
            sum = sum + arr[i][start] + arr[i][end];
            start++;
            end--;
        }
        return sum;
    }
}
