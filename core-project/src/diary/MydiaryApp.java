package diary;

import java.sql.Date;
import java.util.Scanner;

import diary.dal.DiaryFileHandler;
import diary.model.Note;

public class MydiaryApp {
    public static void main(String[] args) {
        DiaryFileHandler handler = new DiaryFileHandler();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----------My Diary App----------");
            System.out.println("1. Write Note");
            System.out.println("2. Read Note by Date");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter note title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter note content: ");
                    String content = scanner.nextLine();
                    String date = Date.valueOf(java.time.LocalDate.now()).toString();

                    Note note = new Note(title, content, date);
                    
                    break;

                case 2:
                    System.out.print("Enter date of the note to read: ");
                    
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }

}
