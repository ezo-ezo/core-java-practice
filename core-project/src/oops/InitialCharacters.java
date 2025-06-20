package oops;

import java.util.Scanner;

public class InitialCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String name = scanner.nextLine();

        String[] words = name.split(" ");
        System.out.print("Initials: ");
        for(int i=0;i<words.length;i++){
            System.out.print(words[i].charAt(0));
        }
        System.out.println();
    }
}
    