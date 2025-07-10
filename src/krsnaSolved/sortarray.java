package krsnaSolved;

import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        int[] arr = {7,2,82,42,12,57,92,24,38,1};
        staticresponce(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int staticresponce(int[] arr) {
        for (int pass = 0; pass < arr.length - 1; pass++) {
            int i = 0;
            while (i < arr.length - 1) {
                int temp;
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
                i++;
            }
        }
        return -1;
    }


}
