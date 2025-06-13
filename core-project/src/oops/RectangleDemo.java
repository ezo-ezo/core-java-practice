package oops;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle myRectangle1 = new Rectangle();
        Rectangle myRectangle2 = new Rectangle(23.45,24.56);

        myRectangle1.height = 20;
        myRectangle1.width = 30;

        

        // float area1 = myRectangle1.height*myRectangle1.width;
        // System.out.println("The area of rectangle is: "+area1);
        // float area2 = myRectangle2.height*myRectangle2.width;
        // System.out.println("The area of rectangle is: "+area2);

        System.out.println("The area of rectangle is: "+myRectangle1.area());
        System.out.println("The area of rectangle is: "+myRectangle2.area());

        
    }
}
