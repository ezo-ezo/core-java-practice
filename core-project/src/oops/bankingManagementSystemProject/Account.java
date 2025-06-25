package oops.bankingManagementSystemProject;

public abstract class Account {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public Account(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void displayAccountDetails();

    public String getaccountNumber(){
        return accountNumber;
    }
    public void setaccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    
    public String getaccountHolderName(){
        return accountNumber;
    }
    public void setaccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    
    public double getbalance(){
        return balance;
    }
    public void setaccountHolderName(double balance){
        this.balance = balance;
    }
    
}
