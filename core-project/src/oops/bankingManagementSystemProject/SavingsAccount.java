package oops.bankingManagementSystemProject;

public class SavingsAccount extends Account {
    final double interestRate = 0.03;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance){
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void deposit(double amount){
        double interest = interestRate*amount;
        balance = balance+(amount+interest);
        System.out.println("Deposited to Savings with interest. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount){
        if(amount<balance){
            balance -= amount;
            System.out.println("Withdrawled from Scavings account. New Balance: " + balance);
        } else{
            System.out.println("Insufficient Balance!");
        }
    }

    @Override
    public void displayAccountDetails(){
        System.out.println("-----Savings Account-----\n" + "Account Holder's Name: " + accountHolderName + "\nAccount Number: " + accountNumber + "\nBalance: " + balance);
    }
}
