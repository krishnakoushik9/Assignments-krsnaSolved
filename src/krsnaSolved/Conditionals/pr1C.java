package krsnaSolved.Conditionals;

public class pr1C {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(8));
    }
    public static boolean powerOfTwo(int n){
        if(n<=0){
            return false;
        }
        while (n > 1){
            if(n % 2 != 0){
                return false;
            }
            n = n / 2;
        }
        return true;
    }
}
