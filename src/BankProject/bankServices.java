package BankProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class ICICI_Bank{
    String branch_Location = "Medchal";
    String IFSC_Code = "23H66BBC3";
    private int total_Funds = 9877622;

    private int AccountNumber;
    private double Bank_Balance;
    private String Account_Holder_Name;
    private boolean UPI_Enabled;
    private List<String> passbook = new ArrayList<>();
    private String PanCard;
    private long Ph_number;
    private String User_Gender;
    private int UPI_Pin;
    private int ATP_PIN;

    void ICICI(){
        System.out.println("--Welcome to ICICI Bank CLI--");
    }

    int generateAccNo(){
        Random r = new Random();
        return 100000+ r.nextInt(9000000);
    }

    void createAccount(String name,long ph,String pan_value,String gender,double amount,boolean UPI,int pin){
        this.AccountNumber = generateAccNo();
        this.Account_Holder_Name=name;
        this.User_Gender = gender;
        this.Bank_Balance += amount;
        this.UPI_Enabled = UPI;
        this.Ph_number = ph;
        this.PanCard = pan_value;
        this.UPI_Pin = pin;
        System.out.println("Mr/Ms "+name+" Account has been Created Successfully at ICICI "+branch_Location+
                " With Account number: "+this.AccountNumber+" Pan Number is: "+pan_value+
                " UPI is Activated: "+UPI_Enabled+" Balance is: "+amount);
    }

    void displayPassBook(int p){
        if(UPI_Pin == p){
            for(String s:this.passbook){
                System.out.println(s);
            }
            System.out.println("Transactions: "+this.Bank_Balance);
        }
        else{
            System.out.println("Error PIN");
        }
    }

    int generateOtp(){
        Random r = new Random();
        return r.nextInt(9999);
    }

    void creditMoney(double a){
        this.Bank_Balance += a;
        System.out.println("Amount Credited");
        this.passbook.add(a+" Is Credited");
    }

    void showBalance(int pin){
        if(pin == UPI_Pin){
            System.out.println(Bank_Balance);
        }else{
            System.out.println("INCORRECT PIN");
        }
    }

    void createUserPin(){
        System.out.println("Start our Process of Creating PIN: ");
//        int number = generateAccNo();
//        System.out.println(number);
        Scanner acc = new Scanner(System.in);
        int acc_number = acc.nextInt();
        if(acc_number == this.AccountNumber){
            int otp = generateOtp();
            System.out.println("OTP: " + otp);
            int otp_User = acc.nextInt();
            if(otp == otp_User){
                System.out.println("Set your ATM PIN: ");
                int Pin_ATP = acc.nextInt();
                this.ATP_PIN = Pin_ATP; // actually set the pin
                System.out.println("ATM PIN Created Successfully!");
            }
            else{
                System.out.println("ReStart Process:");
                createUserPin();
            }
        }else{
            System.out.println("ReStart Process:");
            createUserPin();
        }
    }
}

public class bankServices {
    private static final boolean UPI = true;
    private static ICICI_Bank bankAccount;
    private static Scanner scanner = new Scanner(System.in);

    private static void intializeBank(){
        bankAccount = new ICICI_Bank();
        bankAccount.ICICI();
        bankAccount.createUserPin();
    }

    /*public static void createUserAccount(){
        intializeBank();
        System.out.println("User Name: ");
        String name = scanner.nextLine();
        System.out.println("User Ph Number: ");
        long ph = scanner.nextLong();
        scanner.nextLine(); // consume newline
        System.out.println("Pan Details: ");
        String pan = scanner.nextLine();
        System.out.println("Gender: ");
        String Gender = scanner.nextLine();
        System.out.println("Base Deposited Amount is: ");
        int baseAm = scanner.nextInt();
        System.out.println("UPI PIN is: ");
        int pin = scanner.nextInt();
        bankAccount.createAccount(name,ph,pan,Gender,baseAm,UPI,pin);
        bankAccount.createUserPin();
    }*/

    public static void main(String[] args) {
        intializeBank();
    }
}
