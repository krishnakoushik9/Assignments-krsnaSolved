package krsnaSolved.AdvancedDSA;

import java.util.ArrayList;
public class Q349Type {
    public static void main(String[] args) {
        int[] arr1 = {1,1,1,2,3,5,6,8};
        int[] arr2 = {2,3,4,5,5,5,8,9};
        System.out.println(commonNumber(arr1, arr2));
    }
    public static ArrayList<Integer> commonNumber(int[] arr1, int[] arr2){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                if(arrayList.isEmpty() || arrayList.get(arrayList.size()-1) != arr1[i]){
                    arrayList.add(arr1[i]);
                }
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return arrayList;
    }
}