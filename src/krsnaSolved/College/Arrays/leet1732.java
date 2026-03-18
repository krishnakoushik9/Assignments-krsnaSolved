package krsnaSolved.College.Arrays;

public class leet1732 {
    public static void main(String[] args) {
        int[] arr = {-2,3,0,1,0,-4,12,9,-45};
        System.out.println(highAltitude(arr));
    }
    public static int highAltitude(int[] arr){
        int max = 0;
        int current = 0;
        for(int i = 0;i<arr.length;i++){
            current = current + arr[i];
            if(current > max){
                max = current;
            }
        }
        return max;
    }
}
