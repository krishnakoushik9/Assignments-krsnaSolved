package krsnaSolved;

public class polymorphismClass {
    public static void main(String[] args) {
        Polymorphism p = new Polymorphism();
        System.out.println(p.add(2,3));
        System.out.println(p.add(3.1,2.5));
    }
}
class Polymorphism{
    int add(int a,int b){
        return a + b;
    }
    double add(double a,double b){
        return a + b;
    }
}