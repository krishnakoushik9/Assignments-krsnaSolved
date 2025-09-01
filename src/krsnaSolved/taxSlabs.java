package krsnaSolved;

public class taxSlabs {
    public static void main(String[] args) {
        int salary = 1300000;
        double tax = 0;
        if(salary <= 1200000){
            System.out.println("No tax");
        }else if(salary >1200000 && salary <=1600000){
            tax = 60000 + (float)(salary-1200000)*0.15;
        }
        else if(salary >1600000 && salary <=2000000){
            tax = 120000 + (float)(salary-1600000)*0.20;
        }
        else if(salary >2000000 && salary <=2400000){
            tax = 200000 + (float)(salary-2000000)*0.25;
        }else{
            tax = 300000 + (float)(salary-2400000)*0.3;
        }
        System.out.println(salary);
        System.out.println(tax);
        System.out.println("effective salary is "+ (salary - tax));
    }
}

