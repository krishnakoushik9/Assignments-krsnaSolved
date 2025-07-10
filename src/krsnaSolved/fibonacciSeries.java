package krsnaSolved;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int first_num = 0;
        int second_num = 1;
        fibonacci(first_num,second_num,n);
        scanner.close();
    }
    static void fibonacci(int first_num,int second_num,int n){
        for(int i = 0;i<n;i++){
            System.out.println(first_num + " ");
            int next_num = first_num + second_num;
            first_num = second_num;
            second_num = next_num;
        }
    }
}

