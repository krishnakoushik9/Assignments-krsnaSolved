package krsnaSolved;

import java.util.Arrays;

public class moveEven {
    public static void main(String[] args) {
        int [] arr = {2, 3, 6, 8, 5, 9, 4};
        System.out.println(Arrays.toString(evenFirstSwap(arr)));
    }

    public static int[] evenFirstSwap(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 != 0) {
                right--;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
