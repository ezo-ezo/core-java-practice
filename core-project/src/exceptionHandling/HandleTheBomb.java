package exceptionHandling;

public class HandleTheBomb {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 2;
            int c = a/b;
            System.out.println("C= " + c);
            int arr[] = {1};
            arr[42] = 99;
        } catch(ArithmeticException e){
            System.out.println("Caught the bomb: " + e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound: " + e.getMessage());
        }
        System.out.println("World is safe now!");
        System.out.println("After try/catch blocks");
    }
}
