public class MainClass 
{
    public static void main(String[] args) 
    {
        SavingsAccount joeAccount = new SavingsAccount("Joe", 100, .01);
        
        CheckingAccount emilyAccount = new CheckingAccount("Emily", 200, 10);
        
        emilyAccount.deposit(50);
        
        joeAccount.withdraw(25);
        
        emilyAccount.processCheck(50);
        
        // Transfer $100 from Emily to Joe
        emilyAccount.withdraw(100);
        joeAccount.deposit(100);
        
        SavingsAccount samAccount = new SavingsAccount("Sam", 250, 0.5);
        
        // Depositing monthly interest
        joeAccount.depositMonthlyInterest();
        samAccount.depositMonthlyInterest();
        
        // Withdrawing $500 from accounts
        emilyAccount.withdraw(500);
        joeAccount.withdraw(500);
    }
}
