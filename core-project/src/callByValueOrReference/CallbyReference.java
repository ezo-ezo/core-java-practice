package callByValueOrReference;

import oops.beans.Student;

public class CallbyReference {
    public static void main(String[] args) {
        Student student = new Student(101, "Alice", "Computer Science", 500);
        System.out.println("Before update: " + student);
        updateStudent(student);
        System.out.println("After update: " + student);
    }

    public static void updateStudent(Student s){
        s.setName("Mangal Pandey");
        s.setCourse("Data Science");
        s.setFee(9800);
        System.out.println("Inside updateStudent method: " + s);
    }
}
