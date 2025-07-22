package krsnaSolved;

public class pwr2 {
    public static void main(String[] args) {
        int n = 512;
        boolean ans = isPowerOfTwo(n);
        System.out.println(ans);
    }

    public static boolean isPowerOfTwo(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        if(n<=0){
            return false;
        }
        for(int i = 0;i<binary.length();i++){
            char c = binary.charAt(i);
            if(c == '1'){
                count ++;
            }
        }return count == 1;
    }
}
