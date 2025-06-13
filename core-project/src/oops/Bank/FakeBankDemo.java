package oops.Bank;

public class FakeBankDemo {
    public static void main(String[] args) {
        Address address1 = new Address("123 Main St", "Mumbai", "MH", 400001);
        Customer customer1 = new Customer("Alice", 30, address1);
        Customer customer2 = new Customer("Bob", 25, address1);

        Customer[] customerList = new Customer[5];
        customerList[0] = customer1;
        customerList[1] = customer2;

        Bank bankObj = new Bank("FakeBank", 123456, customerList);
        bankObj.display();
    }
}
