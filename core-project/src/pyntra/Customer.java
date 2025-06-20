package pyntra;

import oops.Bank.Address;

public class Customer extends User {
    private String customerName;
    private String address;
    private String email;

    public Customer(String customerName, String address, String email, String userId, String password){
        super(address, email);
        this.customerName = customerName;
        this.address = address;
        this.email = email;
    }

    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void displayCustomerDetails(){
    System.out.println("name of the customer: "+customerName);
    System.out.println("address of the customer: "+address);
    System.out.println("email of the customer: "+email);
    System.out.println();
    }
}
