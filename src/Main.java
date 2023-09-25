public class Main {
    public static void main(String[] args){

        SavingsAccount A1=new SavingsAccount("Abbey",2000);
        SavingsAccount A2=new SavingsAccount("Akweley",1000);
        SavingsAccount A3=new SavingsAccount("Efua",3600);

        SavingsAccount.modifyInterestRate(0.24f);


        A2.calculateMonthlyInterest();
        A2.checkBalance();






    }
}
