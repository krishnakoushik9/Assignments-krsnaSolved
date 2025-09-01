package krsnaSolved;

public class replaceoneandlast {
    public static void main(String[] args) {
        int n = 3469;
        System.out.println(replaceInt(n));
    }
    public static int replaceInt(int n){
        while(n%10 != 8){
            if(n%10 > 8){
                n--;
            }else{
                n++;
            }
        }
        return n;
    }
}
