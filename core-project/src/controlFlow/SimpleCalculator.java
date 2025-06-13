package controlFlow;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int choice;
        int sum = 0;
        int mul;

        do{
            System.out.println("1. Add\n2. Multiply\n3. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    sum = a+b;
                    System.out.println("Sum: " + sum);
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    mul = a*b;
                    System.out.println("Product: " + mul);
                    break;

                case 3:
                    System.out.println("Exited");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while(choice != 3);
    }
}
