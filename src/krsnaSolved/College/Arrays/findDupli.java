package krsnaSolved.College.Arrays;

import java.util.HashMap;

public class findDupli {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4};
        System.out.println(duplicIndex(arr));
    }
    public static int duplicIndex(int [] arr){
        HashMap<Integer,Integer> seen = new HashMap<>();
        for (int num : arr){
            if(seen.containsKey(num) && seen.get(num)>=1){
                return num;
            }
            seen.put(num,seen.getOrDefault(num,0)+1);
        }
        return -1;
    }
}
