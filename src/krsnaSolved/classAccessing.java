package krsnaSolved;

class Calculator{
    private String developerName = "Krishna";
    static int developerAge = 19;
    public Calculator() {
        System.out.println("Object Created");
    }
    void getDevName(){
        System.out.println(this.developerName);
    }
    int add(int a ,int b){
        return a + b;
    }
    static int sub(int a,int b){
        return a - b;
    }
    int multiply(int a,int b){
        return a * b;
    }
}

public class classAccessing {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.getDevName();
        System.out.println(c1.add(2,3));
        System.out.println(c1.multiply(2,3));
        System.out.println(Calculator.sub(2,3));
    }
}
