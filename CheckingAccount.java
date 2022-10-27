public class CheckingAccount extends BankAccount
{
    double insufficientFundsFee;
    
    public CheckingAccount(String owner, double balance, double insufficientFundsFee) 
    {
        super(owner, balance);
        this.insufficientFundsFee = insufficientFundsFee;
    }
    
    void withdraw(double amount)
    {
        this.balance = this.balance - amount;
        if (this.balance < 0)
        {
            this.balance = this.balance - this.insufficientFundsFee;
        }
    }
    
    void processCheck(double checkAmount)
    {
        this.balance = this.balance +checkAmount;
    }
}
