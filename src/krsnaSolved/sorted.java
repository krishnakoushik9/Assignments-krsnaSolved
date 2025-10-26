package krsnaSolved;

public class sorted {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,72,88};
        boolean ans = sortedOrNot(arr,0);
        System.out.println(ans);
    }
    public static boolean sortedOrNot(int[] arr,int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index + 1] && sortedOrNot(arr,index + 1);
    }
}
