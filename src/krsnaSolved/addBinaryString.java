package krsnaSolved;

public class addBinaryString {
    public static void main(String[] args) {
        String a = "1101";
        String b = "111";
        String ans = addBinary(a,b);
        int decimalSum = Integer.parseInt(ans, 2);
        System.out.println("Decimal Value is: "+decimalSum);
        System.out.println("String: "+ans);

    }
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            carry += (i >= 0) ? a.charAt(i--) - '0' : 0;
            carry += (j >= 0) ? b.charAt(j--) - '0' : 0;
            sb.append(carry % 2);
            carry /= 2;
        }

        String result = sb.reverse().toString();
        return result.charAt(0) == '0' ? result.substring(1) : result;
    }
}
