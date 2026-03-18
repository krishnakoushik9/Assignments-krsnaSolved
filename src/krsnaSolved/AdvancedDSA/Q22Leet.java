package krsnaSolved.AdvancedDSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q22Leet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(generateParenthesis(n));
    }
    public static List<String> generateParenthesis(int n) {
        ArrayList<String> arraylistSaver = new ArrayList<>();
        balanceHelper(n,"",arraylistSaver,0,0);
        return arraylistSaver;
    }

    public static void balanceHelper(int n, String temp, ArrayList<String> result, int open, int close) {
        if(temp.length() == 2*n){
            result.add(temp);
            return;
        }
        if(open < n){
            balanceHelper(n,temp + '(',result,open+1,close);
        }
        if(open > close && close < n){
            balanceHelper(n,temp + ')',result,open,close+1);
        }
    }
}
