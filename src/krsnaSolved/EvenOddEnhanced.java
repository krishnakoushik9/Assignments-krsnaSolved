package krsnaSolved;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EvenOddEnhanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        boolean ans = evenOdd(n);
        System.out.println(ans +"\nIf it true it's an Odd number");
    }
    public static boolean evenOdd(int n){
        return (n & 1) == 1;
    }
}
