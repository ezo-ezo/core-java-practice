package collections;

public class AutoBoxing {
    public static void main(String[] args) {
        // Creating an Integer object with value 10
        Integer i = new Integer(10);

        // Unboxing the object

        int i1 = i;

        System.out.println("Value of i: " + i);
        System.out.println("Va;ue of i1: " + i1);

        // Autoboxing of char
        Character gfg = 'a';

        // Autoboxing of char
        char ch = gfg;

        System.out.println("Value of ch: " + ch);
        System.out.println("Value of gfg: " + gfg);

    }
}