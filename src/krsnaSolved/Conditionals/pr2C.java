package krsnaSolved.Conditionals;

public class pr2C {
    public static void main(String[] args) {
        multipleOfTF(15);
    }
    public static void multipleOfTF(int n){
        for (int i = 1;i<=n;i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}
