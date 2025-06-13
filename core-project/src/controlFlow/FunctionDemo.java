package controlFlow;

public class FunctionDemo {
    public static void greet(String name){
        System.out.println("Hi! this is " + name);
    }
    public static int multiply(int num){
        return num*2;
        
    }
    public static void main(String[] args) {

        String name = "Utkarsh";
        int num = 5;   
        greet(name);
        num = multiply(num);
        System.out.println("product: " + num);

    }
}
