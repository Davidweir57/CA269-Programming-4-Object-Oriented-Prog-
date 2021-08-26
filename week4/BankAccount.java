public class BankAccount
{
    double balance;

    public BankAccount(double amount)
    {
        this.balance = amount;
    }

    public BankAccount()
    {
        this.balance = 100;
    }

    public void withdraw(double withdrawn)
    {
        this.balance -= withdrawn;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
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
        return "The balance is " + this.balance;
    }
}
