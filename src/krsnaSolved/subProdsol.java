package krsnaSolved;

import java.util.Scanner;

public class subProdsol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Solution sol = new Solution();  // Correctly instantiate the object
        int result = sol.subtractProductAndSum(234);
        System.out.println(result);

        scanner.close();
    }

    static class Solution {
        public int subtractProductAndSum(int n) {
            int product = 1;
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                product *= digit;
                sum += digit;
                n /= 10;
            }

            return product - sum;
        }
    }
}
