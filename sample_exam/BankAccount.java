public class BankAccount
{
    private double balance;
    
    public BankAccount(double amount)
    {
        this.balance = amount;
    }

    public BankAccount()
    {
        this.balance = 0;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void setBalance(double amount)
    {
        this.balance = amount;
    }

    public String toString()
    {
        return "The balance is " + this.balance + ".";
    }
}
