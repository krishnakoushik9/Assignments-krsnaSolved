package krsnaSolved;

public class AreaofTriangle {
    public static void main(String[] args) {
        double base = 5;
        double height = 8;
        double Sol = areaTriangle(base,height);
        System.out.println(Sol);
    }
    static double areaTriangle(double base, double height){
        double x = base * height * 0.5;
        return x;
    }
}
