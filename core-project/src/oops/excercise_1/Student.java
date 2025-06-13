package oops.excercise_1;

public class Student {
    String name;int age;
    String grade;
    Address addressObj;

    public Student(String name,int age, String grade, Address addressObj){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.addressObj = addressObj;
    }
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Grade: "+grade);
        addressObj.displayAddress();
    }
}