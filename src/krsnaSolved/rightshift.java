package krsnaSolved;

public class rightshift {
    public static void main(String[] args) {
        int a = 8;
        int shiftTimes = 6;
        int also = shiftRight(a,shiftTimes);
        System.out.println(also);
    }
    public static int shiftRight(int a,int shiftTimes){
        return (int)(a / Math.pow(2, shiftTimes));
    }
}
