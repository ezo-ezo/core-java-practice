package controlFlow;

import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int roll;

        do{
            System.out.print("Enter the number you rolled on the dice: ");
            roll = sc.nextInt();

            if(roll<1 || roll>6){
                System.out.println("Invalid dice number!!");
            } 
            else{
                System.out.println("You entered: " + roll);
            }
        } while(roll!=6);

        System.out.println("You rolled a 6!!!!!!!");
    }
}
