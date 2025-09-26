package RecursionBased;

public class onetoN {
    public static void main(String[] args) {
        callRev(5);
    }
    public static void callRev(int n) {
        if(n==0){
            return;
        }
         callRev(n-1);
        System.out.println(n);
    }
}