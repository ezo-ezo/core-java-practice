package inhertitance;

class Employee{
        String name;
        int id;
        Employee(String name, int id){
            this.name = name;
            this.id = id;
        }
        void displayDetails(){
            System.out.println("Name: " + name);
            System.out.println("Id: " + id);
        }
    }
    class Manager extends Employee{
        double bonus;
        Manager(String name, int id, double bonus){
            super(name, id);
            this.bonus = bonus;
        }
        void displayDetails(){
            System.out.println("Name: " + name);
            System.out.println("Id: " + id);
            System.out.println("Bonus: Rs." + bonus);
        }
    }

public class InheritanceDemo {
    public static void main(String[] args) {
        Manager obj1 = new Manager("Utkarsh", 777, 7000);
        obj1.displayDetails();
    }


}
