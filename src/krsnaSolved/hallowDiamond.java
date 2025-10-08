package krsnaSolved;

public class hallowDiamond {
    public static void main(String[] args) {
        printerSpacedDiamond(5);
    }
    public static void printerSpacedDiamond(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.print("*");
            for (int j = 1; j < (i - 1) * 2; j++) {
                System.out.print(" ");
            }
            if (i != 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
