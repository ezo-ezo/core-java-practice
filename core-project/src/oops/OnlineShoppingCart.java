package oops;

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Product cart[] = new Product[5];

        cart[0] = new Product("Soap", 50.0,2);
        cart[1] = new Product("Shampoo", 350.0,1);
        cart[2] = new Product("Face wash", 250.0,1);
        cart[3] = new Product("Brush", 89.0,4);
        cart[4] = new Product("Gloves", 278.0,2);

        double totalCartCost = 0;
        
        for(int i=0;i<5;i++){
            double cost = cart[i].getTotalCost();
            totalCartCost += cost;

            System.out.println("Product: "+cart[i].productName);
            System.out.println("Price: "+cart[i].price);
            System.out.println("Quantity: "+cart[i].quantity);
            System.out.println("Total cost: Rs."+cost);
            System.out.println();
        }
        System.out.println("Total cost of cart: Rs."+totalCartCost);
    }

}


