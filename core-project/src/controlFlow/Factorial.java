package controlFlow;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        char choice;
        
        
        do{
            System.out.println("Enter the number to find the factorial: ");
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int factorial = 1;
            for (int i=1;i<=a;i++){
                factorial *= i;
            }
            System.out.println("Factorial of number" + a + " is: " + factorial);

            System.out.print("Do you want to continue?(y/n): ");
            choice = sc.next().charAt(0);
            
        } while(choice!='n');

        
    }

}
