package exceptionHandling;

public class HandleAndSettleBomb {
    public static void main(String[] args) {
        try{
            System.out.println("Bomb is about to explode!");
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println("C = " + c);
        } catch(ArithmeticException e){
            System.out.println("Bomb exception handled: " + e.getMessage());
        } finally{
            System.out.println("Finally bomb settled");
        }
        System.out.println("World is safe now!");
    }
}
