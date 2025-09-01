package krsnaSolved;

public class heavyPalindrome {
    public static void main(String[] args) {
        String s = "abcddfcba";
        System.out.println(palindromeRemovalIndex(s));
    }
    public static char palindromeRemovalIndex(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                if (isPalindrome(s.substring(left + 1, right + 1))) return s.charAt(left);
                else if (isPalindrome(s.substring(left, right))) return s.charAt(right);
            left++;
            right--;
        }
        return s.charAt(s.length()/2);
    }
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right) {
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
