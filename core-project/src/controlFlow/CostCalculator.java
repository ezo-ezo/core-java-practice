package controlFlow;

import java.util.Scanner;

public class CostCalculator {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Cost of a Pen:");
        int cost = sc.nextInt();
        int TotalCost = 70*cost;
        int Discount;
        if(TotalCost>=1000){
            Discount = TotalCost*20/100;
            TotalCost -= Discount;
            System.out.println("Amount to pay: Rs."+TotalCost);
        }
        else{
            Discount = TotalCost*10/100;
            TotalCost -= Discount;
            System.out.println("Amount to pay: Rs."+TotalCost);
        }
    }
}
