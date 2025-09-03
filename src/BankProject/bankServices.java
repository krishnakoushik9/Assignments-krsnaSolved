package BankProject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//-------------------------------------------------------------------
// ICICI Bank Related
class ICICI_Bank {
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
    int ATP_PIN;

    //Class of return type of ICICI Starting
    //-----------------------------------------------------------
    void ICICI() {
        System.out.println("--Welcome to ICICI Bank CLI--");
    }
    //Function to Generate Account Number
    //-----------------------------------------------------------
    int generateAccNo() {
        Random r = new Random();
        return 100000 + r.nextInt(9000000);
    }
    //Create Account Function
    //-----------------------------------------------------------
    void createAccount(String name, long ph, String pan_value, String gender, double amount, boolean UPI) {
        this.AccountNumber = generateAccNo();
        this.Account_Holder_Name = name;
        this.User_Gender = gender;
        this.Bank_Balance = amount;
        this.UPI_Enabled = UPI;
        this.Ph_number = ph;
        this.PanCard = pan_value;
        this.UPI_Pin = -1;
        this.ATP_PIN = 0; // Initialize to 0, user must set via createUserPin()
        System.out.println("Mr/Ms " + name + " Account has been Created Successfully at ICICI " + branch_Location +
                " With Account number: " + this.AccountNumber + " Pan Number is: " + pan_value +
                " UPI is Activated: " + UPI_Enabled + " Balance is: " + amount);
    }
    //Function for Display for Passbook
    //-----------------------------------------------------------
    void displayPassBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ATM PIN: ");
        int pin = sc.nextInt();
        if (pin == this.ATP_PIN) {
            for (String s : this.passbook) {
                System.out.println(s);
            }
            System.out.println("Current Balance: " + this.Bank_Balance);
        } else {
            System.out.println("Error: Incorrect ATM PIN");
        }
    }
    //Generate OTP Function
    //-----------------------------------------------------------
    int generateOtp() {
        Random r = new Random();
        return r.nextInt(9999);
    }
    //Crediting Money Function
    void creditMoney(double a) {
        this.Bank_Balance += a;
        System.out.println("Amount Credited");
        this.passbook.add(a + " Is Credited");
    }
    //Showing Bank Balance Function
    //-----------------------------------------------------------
    void showBalance(int pin) {
        if (pin == this.ATP_PIN) {
            System.out.println(Bank_Balance);
        } else {
            System.out.println("INCORRECT PIN");
        }
    }
    //-----------------------------------------------------------
    void withDraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int acc_num = sc.nextInt();
        if (acc_num == this.AccountNumber) {
            System.out.print("Enter ATM PIN: ");
            int pin = sc.nextInt();
            if (pin == this.ATP_PIN) {
                System.out.print("Enter Amount to Withdraw: ");
                double amount = sc.nextDouble();
                if (amount > 0) {
                    if (amount <= this.Bank_Balance) {
                        this.Bank_Balance -= amount;
                        this.passbook.add(amount + " Is Debited (ATM Withdrawal)");
                        System.out.println("Amount Withdrawn Successfully");
                        System.out.println("Remaining Balance: " + this.Bank_Balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                } else {
                    System.out.println("Invalid Amount");
                }
            } else {
                System.out.println("Incorrect ATM PIN");
            }
        } else {
            System.out.println("Invalid Account Number");
        }
    }

    //-----------------------------------------------------------
    //Create a UPI Pin Function
    void setUPIPin(){
        System.out.println("Give US your Pan Card Value: ");
        Scanner pansc = new Scanner(System.in);
        String pan = pansc.next();
        if(pan.equals(this.PanCard)) {
            System.out.println("Match!");
            int Genz = generateOtp();
            System.out.println("OTP is: "+Genz);
            int OTP_CHECKER = pansc.nextInt();
            if(Genz == OTP_CHECKER){
                System.out.println("OTP IS CORRECT");
                System.out.println("Set your UPI Pin");
                int upi_setup = pansc.nextInt();
                System.out.println(upi_setup);
                this.UPI_Pin = upi_setup;
                System.out.println(this.UPI_Pin);
            }
            else{
                System.out.println("Wrong OTP");
                setUPIPin();
            }
        }
        else{
            System.out.println("Wrong Pan!");
            setUPIPin();
        }

    }

    //-----------------------------------------------------------
    // Modified transferAmount to use ATP_PIN (ATM PIN)
    void transferAmount(int amount, ICICI_Bank receiver) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your ATM PIN: ");
        int pin = sc.nextInt();
        if (pin == this.ATP_PIN) {
            if (this.Bank_Balance >= amount) {
                this.Bank_Balance -= amount;
                receiver.Bank_Balance += amount;
                this.passbook.add(amount + " debited (Transferred to " + receiver.AccountNumber + ")");
                receiver.passbook.add(amount + " credited (Received from " + this.AccountNumber + ")");
                System.out.println("Transfer successful!");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Incorrect ATM PIN.");
        }
    }

    //-----------------------------------------------------------
    void createUserPin() {
        System.out.println("Start our Process of Creating PIN: ");
        Scanner acc = new Scanner(System.in);
        int acc_number = acc.nextInt();
        if (acc_number == this.AccountNumber) {
            int otp = generateOtp();
            System.out.println("OTP: " + otp);
            int otp_User = acc.nextInt();
            if (otp == otp_User) {
                System.out.println("Set your ATM PIN: ");
                int Pin_ATP = acc.nextInt();
                this.ATP_PIN = Pin_ATP;
                System.out.println("ATM PIN Created Successfully!");
            } else {
                System.out.println("ReStart Process:");
                createUserPin();
            }
        } else {
            System.out.println("ReStart Process:");
            createUserPin();
        }
    }
}

//-----------------------------------------------------------
public class bankServices {
    private static final boolean UPI = true;
    private static ICICI_Bank AnilBank;
    private static ICICI_Bank rahulBank;
    private static Scanner scanner = new Scanner(System.in);

    //-----------------------------------------------------------
    private static void anilInitialize(){
        AnilBank = new ICICI_Bank();
        AnilBank.ICICI();
        AnilBank.createAccount("Anil", 80194355, "hsb3455", "Male", 45000, true);
        AnilBank.createUserPin(); // User sets ATM PIN here (e.g., 1234)
        AnilBank.setUPIPin();
    }


    //-----------------------------------------------------------
    private static void rahulIntialize() {
        rahulBank = new ICICI_Bank();
        rahulBank.createAccount("Rahul", 9177155, "hb36gg", "Male", 5000, true);
        rahulBank.createUserPin();
        rahulBank.setUPIPin();
    }

    //-----------------------------------------------------------
    public static void tranferBetweenBanks(){
        System.out.print("Enter Anil's ATM PIN to transfer: ");
        int anilPin = scanner.nextInt();
        if (anilPin == AnilBank.ATP_PIN) {
            AnilBank.transferAmount(2500, rahulBank);
        } else {
            System.out.println("Incorrect PIN. Transfer cancelled.");
        }
        System.out.print("Enter Anil's ATM PIN to check balance: ");
        int anilBalancePin = scanner.nextInt();
        if (anilBalancePin == AnilBank.ATP_PIN) {
            AnilBank.showBalance(anilBalancePin);
        }
        System.out.print("Enter Rahul's ATM PIN to check balance: ");
        int rahulBalancePin = scanner.nextInt();
        if (rahulBalancePin == rahulBank.ATP_PIN) {
            rahulBank.showBalance(rahulBalancePin);
        }
    }


    public static void main(String[] args) {
        anilInitialize();
        rahulIntialize();
        tranferBetweenBanks();
    }
}
