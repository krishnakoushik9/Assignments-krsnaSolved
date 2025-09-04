//Inheritance OOPS Concept
//Single Level Inheritance
package krsnaSolved;
//--------------------------------------------
//GrandFather
class GrandFather{
    void networthAmount(){
        System.out.println("10000k");
    }
    void displayIQ(){
        System.out.println("The IQ is 94");
    }
}
//---------------------------------------------
//Father
class Father extends GrandFather{
    void showHeight(){
        System.out.println("The Height is 6ft");
    }
    void displayIQ(){
        System.out.println("The IQ is 134");
    }
}
//--------------------------------------------
//Son
class Son extends Father{
    void show(){
        System.out.println("Son Height is 5ft");
    }
}
//--------------------------------------------
//Main Function
public class encapsulationSep4 {
    public static void main(String[] args) {
        Son c = new Son();
        Father f = new Father();
        GrandFather g = new GrandFather();
        c.show();
        c.displayIQ();
        f.showHeight();
        g.networthAmount();
    }
}
