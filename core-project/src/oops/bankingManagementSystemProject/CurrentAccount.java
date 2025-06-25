package oops.bankingManagementSystemProject;

public class CurrentAccount extends Account {
    double overdraftLimit = 5000;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance){
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void deposit(double amount){
        balance += amount;
        System.out.println("Amount Deposited to Current Account. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount){
        if(balance - amount <= -overdraftLimit){
            balance -= amount;
            System.out.println("Withdrawn from Current. New balance: " + balance);
        } else{
            System.out.println("Overdraft limit exceeded in Current Account.");
        }
    }

    @Override
    public void displayAccountDetails(){
        System.out.println("-----Current Account-----\n" + "Account Holder's Name: " + accountHolderName + "\nAccount Number: " + accountNumber + "\nBalance: " + balance);
    }
}
