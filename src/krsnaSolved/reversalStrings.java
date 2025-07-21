package krsnaSolved;

public class reversalStrings {
    public static void main(String[] args) {
        char[] s = {'H', 'E', 'L', 'L', 'O'};
        reversalStrings obj = new reversalStrings();
        obj.reverseString(s);
        System.out.println(s);
    }
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
