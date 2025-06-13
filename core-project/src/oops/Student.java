package oops;

import java.rmi.StubNotFoundException;

public class Student {
    String name ;
    int age;
    String grade;

    public Student(){
        this.name = "Unknown";
        this.age = 0;
        this.grade = "Not assigned";
    }

    public Student(String name,int age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Grade.: "+grade);
    }
}
