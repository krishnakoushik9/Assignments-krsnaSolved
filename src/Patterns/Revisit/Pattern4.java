package Patterns.Revisit;

public class Pattern4 {
    public static void main(String[] args) {
        patterFour(8);

    }
    public static void patterFour(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
}
