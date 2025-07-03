package studentManagementProject;

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
}
