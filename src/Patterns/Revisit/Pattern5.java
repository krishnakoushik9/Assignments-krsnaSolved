package Patterns.Revisit;

public class Pattern5 {
    public static void main(String[] args) {
        patternFive(5);
    }
    public static void patternFive(int n){
        for(int row = 0; row < 2 * n;row ++){
            int totalCol = row > n ? 2 * n - row : row;
            for (int col = 0;col < totalCol ;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
