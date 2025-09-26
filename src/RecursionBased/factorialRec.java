package RecursionBased;

public class factorialRec {
    public static void main(String[] args) {
        System.out.println(factorialSteps(5));
    }
    public static int factorialSteps(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorialSteps(n-1);
    }
}
