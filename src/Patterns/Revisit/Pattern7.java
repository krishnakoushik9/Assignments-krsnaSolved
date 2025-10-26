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
    //Main
    public static void main(String[] args) {
        // * * * *
        // * * *
        // * *
        // *
        trainglePrint(4,0);
    }
}
