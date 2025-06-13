package oops.Bank;

public class Customer {
    String name;
    int age;
    Address address;

    public Customer(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Age: " + age);
        address.display();
    }
}
