package Patterns.Revisit;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        patterOne(8);

    }
    public static void patterOne(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
