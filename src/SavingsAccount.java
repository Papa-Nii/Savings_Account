public class SavingsAccount {
    //declaring a variable for the name of the account
    private String Name;

    // declaring a static variable called interestrate
    private static float annualInterestRate = 0.15f;

    // declaring a private variable called savingsBalance
    private float savingsBalance;


    SavingsAccount(String account_name,double accountBalance){
        this.savingsBalance =(float)accountBalance;
        this.Name=account_name;
    }

    // calculate the monthly interest rate and add it to the current savings balance of customer
    public void calculateMonthlyInterest(){
        System.out.println(this.Name+"'s Monthly Interest is "+(this.savingsBalance*annualInterestRate)/12);
        this.savingsBalance+=(this.savingsBalance*annualInterestRate)/12;
       //return ((this.savingsBalance*annualInterestRate)/12)+this.savingsBalance;
    }

    public static void modifyInterestRate (float newInterestRate){

        annualInterestRate = newInterestRate;
    }
    public void Deposit(double deposit_Amount){

        this.savingsBalance+=(float)deposit_Amount;
        System.out.println("Deposit successful."+this.Name+"'s New account balance is "+this.savingsBalance);
    }

    //to display the current account's balance
    public void checkBalance(){
        System.out.println(this.Name+"'s Account Balance is "+this.savingsBalance);

    }

}
