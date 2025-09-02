package krsnaSolved;

public class xorOperation {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,4,5,6,5,6};
        System.out.println(xorApplied(arr));
    }
    private static int xorApplied(int[] arr) {
        int xor = 0;
        for (int j : arr) {
            xor ^= j;
        }
        return xor;
    }
}
