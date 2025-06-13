package controlFlow;

import java.util.Scanner;

public class MaxMin {
    public static void main(String []args)
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two number");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a==b){
        System.out.println("Both Numbers are Equal");
        }
        else if(a>b){
        System.out.println("a is Max:"+a);
        }
        else{
        System.out.println("b is Max:"+b);
        }
    }
}


