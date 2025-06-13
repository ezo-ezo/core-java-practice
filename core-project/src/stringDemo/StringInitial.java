package stringDemo;

import java.util.Scanner;

public class StringInitial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();

        System.out.print("Enter third word: ");
        String word3 = sc.nextLine();

        System.out.println("Initial characters are: " + 
            word1.charAt(0) + ", " + 
            word2.charAt(0) + ", " + 
            word3.charAt(0));
    }
}
