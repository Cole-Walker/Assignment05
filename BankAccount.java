public class BankAccount
{
    String owner;
    double balance;
    
    BankAccount(String owner, double balance)
    {
        this.owner = owner;
        this.balance = balance;
    }
    
    void deposit(double amount)
    {
        this.balance = this.balance + amount;
    }
    
    void withdraw(double amount)
    {
        this.balance = this.balance - amount;
        
    }
}
