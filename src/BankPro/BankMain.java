package BankPro;

public class BankMain
{
    public static void main(String [] args)
    {
        Account customer1=new Account();//ceate an  account object
        customer1.deposit(500);

        //second customer
        Account customer2=new Account();
        customer2.deposit(1000);
        customer2.withdraw(12);

        System.out.print("Customer1 has a balance of ");
        System.out.println(customer1.getBalance());
        System.out.print("Customer2 has a balance of ");
        System.out.println(customer2.getBalance());
    }
}
