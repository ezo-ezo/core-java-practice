package pyntra;

public class Order {
    private long orderId;
    private double totalPrice;

    public Order(long orderId, double totalPrice){
        this.orderId = orderId;
        this.totalPrice = totalPrice;
    }
    public long getOrderId(){
        return orderId;
    }
    public void setOrderId(long orderId){
        this.orderId = orderId;
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }
    
    public void displayOrderDetails(){
        customer.displayCustomerDetails();
        for(int i=0;i<product.length;i++){
            product[i].displayDetails();
        }
        
        System.out.println("order ID: "+orderID);
        System.out.println();
        System.out.println("total price: "+totalPrice);
        

    }
    public void totalPrice(){
         double sum=0;
        for(int i=0;i<product.length;i++){
            sum+=product[i].getPrice();
        }
        this.totalPrice=sum;

    }


}
