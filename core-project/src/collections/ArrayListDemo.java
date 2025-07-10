package collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add(42);
        list.add(3.14);

        System.out.println("ArrayList contents: ");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("Size of ArrayList: " + list.size());

        // Demonstrating type safety with generics
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("java");
        stringList.add("Python");
        stringList.add("C++");
        
        System.out.println("String ArraList content: ");
        for(String str : stringList){
            System.out.println(str);
        }
    }
}
