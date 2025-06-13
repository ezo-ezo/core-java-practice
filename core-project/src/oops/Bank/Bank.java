package oops.Bank;

public class Bank {
    String name;
    int licenseNumber;
    Customer[] customers;

    public Bank(String name, int licenseNumber, Customer[] customers) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.customers = customers;
    }

    public void display() {
        System.out.println("Bank Name: " + name);
        System.out.println("License Number: " + licenseNumber);
        System.out.println("Customer List:");
        for (Customer c : customers) {
            if (c != null) {
                c.display();
                System.out.println();
            }
        }
    }
}
