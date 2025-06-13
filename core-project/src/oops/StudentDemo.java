package oops;

public class StudentDemo {
    public static void main(String[] args) {
        // Student student1 = new Student();
        // Student student2 = new Student();

        // student1.name = "Utkarsh Kukreti";
        // student1.age = 19;
        // student1.registerationNum = "23BCE1224";
        
        // student2.name = "Gangaraam";
        // student2.age = 19;
        // student2.registerationNum = "23BAI1455";

        // student1.display();
        // System.out.println();
        // student2.display();

        Student student1 = new Student();
        System.out.println("Student 1 information:");
        student1.display();

        Student student2 = new Student("Alice",20,"A");
        System.out.println("Student 2 information: ");
        student2.display();

        int i[] = new int[5];
        Student studentArray[] = new Student[5];
        for(int j=0;j<studentArray.length;j++){
            studentArray[j] = new Student("Student" + (j+1), 18+j, "Grade" + (j+1));
            studentArray[j].display();
        }
        

    }
}
