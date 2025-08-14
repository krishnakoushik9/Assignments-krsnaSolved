package krsnaSolved;

public class findInsideBinary {
    public static void main(String[] args) {
        System.out.println(returnValue(10, 4));
    }
    public static int returnValue(int n, int target){
        return (n >> (target - 1)) & 1;
    }
}