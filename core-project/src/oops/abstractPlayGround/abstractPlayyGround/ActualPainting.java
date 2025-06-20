package oops.abstractPlayGround.abstractPlayyGround;

public class ActualPainting extends AbstractPainting {

    @Override
    public void display() {
        System.out.println("Displaying the actual painting.");
    }

    @Override
    public void paint() {
        System.out.println("Painting badhiya hai !");
    }

    public static void main(String[] args) {

        ActualPainting painting = new ActualPainting();
        painting.display(); // Calls the overridden method
        painting.paint(); // Calls the method from the abstract class
    }

}
