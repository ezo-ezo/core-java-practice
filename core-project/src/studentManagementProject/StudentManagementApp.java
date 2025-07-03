package studentManagementProject;

import java.util.Scanner;

public class StudentManagementApp {

    private StudentManager manager = new StudentManager();
    private StudentFileHandler fileHandler = new StudentFileHandler();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

    public void showMenu() {
        
        int choice;

        do {
            System.out.println("\n----------Student Management----------");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. View Student");
            System.out.println("5. List All Students");
            System.out.println("6. Exit and Save");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 6);

        public void performAdd(){

        }

        public void performDelete(){

        }

        public void performUpdate(){

        }

        public void performView(){

        }

        public void performList(){

        }

        public void exitAndSave(){
            
        }
    }
}
