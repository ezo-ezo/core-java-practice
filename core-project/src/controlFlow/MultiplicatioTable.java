package controlFlow;

import java.util.Scanner;

public class MultiplicatioTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which number's table do you want: ");
        int n = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}