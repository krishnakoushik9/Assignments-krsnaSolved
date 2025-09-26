package RecursionBased;

public class sumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigitsNto1(252));
    }
    public static int sumDigitsNto1(int n){
        if(n == 0){
            return 0;
        }
        return (n % 10) + sumDigitsNto1(n/10);
    }
}
