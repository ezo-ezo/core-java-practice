package controlFlow;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pass;
        do{
            System.out.print("Enter the password: ");
            pass = sc.nextLine();
        } while(pass == "admin123");
        System.out.println("Access granted!");
    }
}


