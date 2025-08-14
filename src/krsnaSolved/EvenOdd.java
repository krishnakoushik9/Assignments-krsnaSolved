package krsnaSolved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        String ans = evenOdd(n);
        System.out.println("The Given Input digit is a "+ans);
    }
    public static String evenOdd(int n){
        List<Integer>remainders = new ArrayList<>();
        while(n!=0){
            int remainder = n % 2;
            remainders.add(remainder);
            n = n/2;
        }
        Collections.reverse(remainders);
        Integer[] arr = remainders.toArray(new Integer[0]);
        int last = arr.length-1;
        if(arr[last] == 1){
            return "odd";
        }
        return "even";
    }
}
