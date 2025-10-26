package krsnaSolved;

import java.util.ArrayList;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,8,12,7};
        int size = 3;
        slidingWindow(arr,size);
    }
    public static void slidingWindow(int[] arr,int size){
        int subArraySum = 0;
        int answer = 0;
        for(int i = 0;i<arr.length-size;i++){
            subArraySum = 0;
            answer = subArraySum + arr[i];
            for(int j = i;j<i+size;j++){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[j]);
                System.out.println(list);
                subArraySum = subArraySum + arr[j];
            }
        }
        System.out.println(subArraySum);
    }
}
