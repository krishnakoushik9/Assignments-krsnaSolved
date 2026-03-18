package krsnaSolved.Conditionals;

import java.util.Scanner;

public class pr4C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you above 18");
        System.out.println("Reply with yes/no");
        String answer = scanner.next();
        bouncerBot(answer);
        scanner.close();
    }
    public static void bouncerBot(String ans){
        if(ans.equalsIgnoreCase("yes")){
            System.out.println("Allowed");
        }else{
            System.out.println("Get-Out");
        }
    }
}
