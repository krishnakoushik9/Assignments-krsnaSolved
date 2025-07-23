package krsnaSolved;

public class pwrof3 {
    public static void main(String[] args) {
        int n = 9;
        boolean ans = sqr3(n);
        System.out.println(ans);
    }
//Testing for Push to Git
    private static boolean sqr3(int n) {
        if(n<=0)return false;
        while(n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }
}
