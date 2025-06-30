package fileI.O.withoutByteConversion;
import java.io.*;

public class SimpleWrite {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("abc.txt");
            fw.write("My name is Utkarsh");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
