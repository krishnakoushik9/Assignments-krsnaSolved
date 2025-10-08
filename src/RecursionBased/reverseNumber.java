package RecursionBased;

public class reverseNumber {
    static int sum = 0;
    public static void numberReversal(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        numberReversal(n / 10);
    }

    public static void main(String[] args) {
        numberReversal(8765);
        System.out.println(sum);
    }


}
