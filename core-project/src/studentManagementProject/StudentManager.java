package studentManagementProject;

import java.io.BufferedReader;
import java.io.FileReader;
import callByValueOrReference.Student;

public class StudentManager {

    public boolean addStudent(Student s){
        if(studentFileHandler.saveStudent(student))
        return true;
        else
        return false;
    }

    public boolean deleteStudent(){
        if(studentFileHandler.saveStudent(student))
        return true;
        else
        return false;
    }
    
    public void list() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("No data yet.");
        }
    }

    public Student[] getAllStudent(){
        return studentFileHandler.loadStudents();
    }

    public Student getStudent(int id){
       Student obj= studentFileHandler.getStudent(id);
       return obj;
    }

    public int getStudentIndex(int id){
       int index= studentFileHandler.getStudentIndex(id);
       return index;
    }
}
