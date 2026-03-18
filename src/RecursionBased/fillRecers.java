package RecursionBased;
import java.util.Scanner;

public class fillRecers {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Text:");
        reverse();
        System.out.println();
    }

    static void reverse() {
        char c = sc.next().charAt(0);

        if (c != '\n') {
            reverse();
            System.out.print(c);
        }
    }
}
