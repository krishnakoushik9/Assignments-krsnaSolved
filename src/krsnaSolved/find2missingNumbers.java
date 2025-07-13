package krsnaSolved;


import java.util.ArrayList;
import java.util.List;

public class find2missingNumbers {
    public static void main(String[] args) {
        int[] arr = {7,2,3,2,1,2,4};
        List<Integer> ans = sortingDone(arr);
        System.out.println(ans);

    }
    public static List<Integer> sortingDone(int[]arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> myList = new ArrayList<>();
        int j = 0;
        while(j<arr.length){
            if(arr[j]!=j+1){
                myList.add(j+1);
            }j++;
        }
        return myList;
    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
