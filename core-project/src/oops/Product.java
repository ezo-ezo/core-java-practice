package oops;

public class Product{
    String productName;
    double price;
    double quantity;
    
    public Product(String productName, double price, double quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    double getTotalCost(){
        return price*quantity;
    }

}
