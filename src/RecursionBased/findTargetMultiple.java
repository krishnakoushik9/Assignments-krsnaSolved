package RecursionBased;

import java.util.ArrayList;

public class findTargetMultiple {

    static ArrayList<Integer> list = new ArrayList<>();
     
    public static void findAllIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,9,3,12,7,4,8,4};
        findAllIndex(arr,4,0);
        System.out.println(list);
    }
}
