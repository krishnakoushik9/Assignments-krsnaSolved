package Patterns.Revisit;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int value = n.nextInt();
        patternSix(value);
        n.close();
    }
    public static void patternSix(int n){
        for(int row = 1;row <= n ; row++){
            int col_spaces = 0;
            for(col_spaces = 0;col_spaces<n-row;col_spaces++){
                System.out.print("  ");
            }
            for(int col = row;col>=1;col--){
                if(col == row){
                    System.out.print(col+" ");
                }
                else if(col == 1){
                    System.out.print(col+" ");
                }
                else if(row == n){
                    System.out.print(col+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
