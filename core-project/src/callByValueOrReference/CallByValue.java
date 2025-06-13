package callByValueOrReference;

public class CallByValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swap: a = " + a + "b = " + b);
        swap(a,b);
        System.out.println("After swap: a = " + a + "b = " + b);
    }
    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Inside swap method: x = " + x + "y = " + y);
    }
}
