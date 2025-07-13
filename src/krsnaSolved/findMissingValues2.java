package krsnaSolved;

public class findMissingValues2 {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,2,7,4};
        int ans = findDuplicate(arr);
        System.out.println();

    }
    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                        swap(arr, i, correct);
                } else {
                        return arr[i]; // 🔁 duplicate found
                }
                } else {
                    i++;
                }
            }
        return -1; // In case no duplicate is found
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
