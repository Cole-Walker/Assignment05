public class SavingsAccount extends BankAccount
{
    double annualInterestRate;
    
    SavingsAccount(String name, double balance,double interest)
    {
        super(name, balance);
        this.annualInterestRate = interest;
    }
    
    public void depositMonthlyInterest()
    {
        this.balance += (this.annualInterestRate/12)*this.balance;
    }
    
    public void withdraw(double amount)
    {
        if(this.balance - amount >= 0)
        {
            this.balance = this.balance - amount;
        }
        else
        {
            System.out.println("Error, the account is overdrawn!");
        }
    }
}
