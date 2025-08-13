package Patterns.Revisit;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        patterTwo(8);

    }
    public static void patterTwo(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
