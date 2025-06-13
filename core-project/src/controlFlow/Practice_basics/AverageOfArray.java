package controlFlow.Practice_basics;

import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        System.out.println("Enter 5 integers:");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = sum/5.0;
        System.out.println("Average of the elements in the array is: " +avg);
        System.out.println("Elements greater than average: ");
        for(int num:arr){
            if (num>avg){
                System.out.println(num);
            }
        }
    }
}
