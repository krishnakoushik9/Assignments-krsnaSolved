package krsnaSolved.Conditionals;

public class pr3C {
    public static void main(String[] args) {
        //int k = digitalRoot(38);
        System.out.println(digitalRootLoop(8));
        //System.out.println(k);
    }
    public static int digitalRoot(int n){
        return (1 + (n - 1) % 9);
    }
    public static int digitalRootLoop(int n){
        while ( n >= 10){
            int sum = 0;
            while (n > 0){
                sum += n % 10;
                n = n / 10;
            }
            n = sum;
        }
        return n;
    }
}
