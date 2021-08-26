// Tests for BankAccount.java

// TEST 1
// public class TestBankAccount
// {
//    public static void main(String [] args)
//    {
//       BankAccount currentAccount = new BankAccount();

//       currentAccount.balance = 60.05;

//       System.out.println("The balance is " + currentAccount.balance);

//       currentAccount.balance = currentAccount.balance + 10;

//       System.out.println("The balance is " + currentAccount.balance);
//    }
// }

// TEST 2 
// public class TestBankAccount
// {
//    public static void main(String [] args)
//    {
//       BankAccount currentAccount = new BankAccount(10000.00);

//       System.out.println("The balance is " + currentAccount.balance);
//    }
// }

// TEST 3 Withdraw method
// public class TestBankAccount
// {
//    public static void main(String [] args)
//    {
//       BankAccount currentAccount = new BankAccount(10000.00);

//       System.out.println("The balance is " + currentAccount.balance);

//       currentAccount.withdraw(100.00);

//       System.out.println("The balance is " + currentAccount.balance);
//    }
// }

// TEST 4 Deposit Method
// public class TestBankAccount
// {
//    public static void main(String [] args)
//    {
//       BankAccount currentAccount = new BankAccount(10000.00);

//       System.out.println("The balance is " + currentAccount.balance);

//       currentAccount.deposit(100.00);

//       System.out.println("The balance is " + currentAccount.balance);
//    }
// }

// TEST 5 MIA Bank question (no args constructor)
// public class TestBankAccount
// {
//    public static void main(String [] args)
//    {
//       BankAccount account1 = new BankAccount(); // This uses the default constructor.
//       BankAccount account2 = new BankAccount(900); // This uses one argument constructor.

//       System.out.println("Account 1 has " + account1.balance);

//       System.out.println("Account 2 has " + account2.balance);
//    }
// }

// TEST 6 toString test
// public class TestBankAccount
// {
//    public static void main(String [] args)
//    {
//       BankAccount account = new BankAccount(); // This uses the default constructor.

//       System.out.println(account);
//       account.withdraw(25);

//       System.out.println(account);
//    }
// }

// TEST 7 getBalance and setBalance
public class TestBankAccount
{
   public static void main(String [] args)
   {
      BankAccount account = new BankAccount(); // This uses the default constructor.

      account.setBalance(650.00);
      System.out.println(account.getBalance());
      account.withdraw(25);

      System.out.println(account.getBalance());
   }
}
