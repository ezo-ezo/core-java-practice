package Static;

public class StaticExampleDemo {
    public static void main(String[] args) {
        StaticExample example1 = new StaticExample();
        System.out.println("After creating 1 instance:" + example1);
        StaticExample example2 = new StaticExample();
        System.out.println("After creating 2 instance:" + example2);
        StaticExample example3 = new StaticExample();
        System.out.println("After creating 3 instance:" + example3);
        StaticExample.staticCount = 10;
        System.out.println("Sfter modifying staticCount: " + example3);
        final float PI = 3.14f; 
    }
}
