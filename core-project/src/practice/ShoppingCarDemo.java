package practice;

public class ShoppingCarDemo {
     public static void main(String[] args) {
        Products p1=new Products("brush","123",90);
        Products p2=new Products("chocolate","321",189);
        Products p3=new Products("juice","111",100);

        ShoppingCart shoppingCart=new ShoppingCart(p1, p2, p3);
        shoppingCart.displayCart();
        shoppingCart.total();
    }

}
