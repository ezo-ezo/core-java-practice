package studentManagementProject;

import java.io.BufferedReader;
import java.io.FileReader;

import callByValueOrReference.Student;

public class StudentManager {

    public boolean addStudent(Student s){
        if(count < students.length){
            students[count++] = s;
            return true;
        }
        return false;
    }

    public boolean deleteStudent(){

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
}
