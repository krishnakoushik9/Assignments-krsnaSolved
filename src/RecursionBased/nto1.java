package RecursionBased;

public class nto1 {
    public static void main(String[] args) {
        callNto1(5);
    }
    public static void callNto1(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        callNto1(n-1);
    }
}