package Patterns.Revisit;

public class Pattern7 {
    public static void trainglePrint(int r,int c){
        if(r == 0){
            return;
        }
        if (c < r){
            System.out.printf("*");
            trainglePrint(r,c+1);
        }
        else{
            System.out.println();
            trainglePrint(r-1,0);
        }
    }
    public static void traingleNormal(int r,int c){
        if(r == 0){
            return;
        }
        if (c < r){
            traingleNormal(r,c+1);
            System.out.printf("*");
        }
        else{
            traingleNormal(r-1,0);
            System.out.println();
        }
    }
    //Main
    public static void main(String[] args) {
        // * * * *
        // * * *
        // * *
        // *
        trainglePrint(4,0);
        // *
        // * *
        // * * *
        // * * * *
        traingleNormal(4,0);
    }
}
