package krsnaSolved;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(isBinaryPalindrome(5));
    }
    public static boolean isBinaryPalindrome(int number) {
        int left = Integer.SIZE - 1;
        //Start left at the highest bit index (31 for 32-bit int).
        //Move left down to the highest set bit to ignore leading zeros.
        int right = 0;
        while (left > right && ((number & (1 << left)) == 0)) {
            left--;
        }
        //Mismatched means return false immediately.
        while (left > right) {
            if (((number >> left) & 1) != ((number >> right) & 1)) {
                return false;
            }
            left--;
            right++;
        }
        return true;
    }
}
