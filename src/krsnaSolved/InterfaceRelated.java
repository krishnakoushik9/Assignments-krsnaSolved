package krsnaSolved;
// Main class-----------------------------------
public class InterfaceRelated {
    public static void main(String[] args) {
        testInterface obj = new TestClass();
        obj.display();
        TestClass view = new TestClass();
        view.sum(5,1);
    }
}
//Interface--------------------------------------
interface testInterface{
    void display();
}
//Test Class-------------------------------------
class TestClass implements testInterface{
    @Override
    public void display() {
        System.out.println("GEEK");
    }
    public void sum(int a,int b){
        System.out.print(a + b);
    }
}