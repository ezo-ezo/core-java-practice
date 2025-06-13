package oops.Bank;

public class Address {
    String street, city, state;
    int postalCode;

    public Address(String street, String city, String state, int postalCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public void display() {
        System.out.println("Address: " + street + ", " + city + ", " + state + " - " + postalCode);
    }
}
