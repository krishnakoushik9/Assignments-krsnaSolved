package krsnaSolved;

public class Squareroot {
    public static void main(String[] args) {
        int sol = mySqrt(81);
        System.out.println(sol);
    }
    public static int mySqrt(int x) {
        if(x<2) return x;
        int left = 1;
        int right = x;
        int ans = 0;
        while(left<=right){
            int mid = left + (right - left)/2;
            if((long)mid * mid == x){
                return mid;
            }else if((long)mid * mid < x){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid + 1;
            }
        }
        return ans;
    }
}
