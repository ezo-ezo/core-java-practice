package oops.bankingManagementSystemProject;

public class Bank {
    private Account[] accounts = new Account[100];
    int accountCount;

    public void addAccount(Account account){
        
         
    }

    public Account findAccount(String accountNumber){
        for(int i=0;i<accounts.length;i++){
            if(accounts[i].getaccountNumber().equals(accountNumber)){
                return accounts[i];
            } else{
            System.out.println("Account not found.");
            }
        } 
        return null;
    }

    public void displayAllAccounts(){
        for(int i=0;i<accounts.length;i++){
            accounts[i].displayAccountDetails();
        }
    }
}       
