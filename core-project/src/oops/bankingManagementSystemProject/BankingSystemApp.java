package oops.bankingManagementSystemProject;
import java.util.*;

public class BankingSystemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;

        do{
            System.out.println("----------Welcome to the BANK----------");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    System.out.println("Enter Account Number: ");
                    String accountNumber = sc.nextLine();
                    bank.findAccount(accountNumber);
                    System.out.println("Enter the amount to deposit: ");
                    double amount = sc.nextDouble();
                    

                    break;
                case 3:
                    
                    break;
                case 4:
                    bank.displayAllAccounts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.out.println("----------EXITED----------");
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while(choice != 5);
    }
}
