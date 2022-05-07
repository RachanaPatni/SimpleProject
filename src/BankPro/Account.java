package BankPro;

public class Account
{
    private double balance;
    //set balance to 0.00
    public Account(){
        balance=0.0;
    }
    //kuch to dalo
    public void deposit(double amount){
        balance = balance + amount;
    }
    // withdraw
    public void  withdraw(double amount)
    {
        if(amount<=balance) {
            balance = balance - amount;
        }
        else {
            System.err.println("Transactiong canclled ");
        }
    }
    // get balance
    public double getBalance()
    {
        return  balance;
    }
}
