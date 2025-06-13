package controlFlow;

public class BreakContinueDemo {
    public static void main(String[] args) {

        System.out.println("Welcome to Java ke break");
        // demostrate break in for loop
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Value of i:" + i);
        }

        System.out.println("Let's check continue");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Value of i:" + i);
        }

        System.out.println("Contuniue your Java journey");
    }
}