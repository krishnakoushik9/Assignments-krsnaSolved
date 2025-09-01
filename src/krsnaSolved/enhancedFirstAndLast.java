package krsnaSolved;
//Cantilever Training
public class enhancedFirstAndLast {
    public static void main(String[] args) {
        System.out.println(changeSecondLast(3670));
        System.out.println(changeLast(3670));
        System.out.println(changeFirst(3670));
    }
    public static int changeSecondLast(int n){
        int l = n % 10;
        n = n - (n%100);
        n = n + l + 8 * 10;
        return n;
    }
    public static int changeLast(int n){
        n = n - n % 10;
        n = n + 5;
        return n;
    }
    public static int changeFirst(int n){
        int a = (int) (Math.log10(n) + 1);
        int b = (int) (n % Math.pow(10,a-1));
        b = (int) (b + 2 * Math.pow(10,a-1));
        return b;
    }
}
