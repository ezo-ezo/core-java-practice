package fileIO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class MyDeSerializer {
    public static void main(String[] args) {
        Address addressObj =  null;
        try {
            FileInputStream fin = new FileInputStream("D:\\temp_java\\address.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            addressObj = (Address) ois.readObject();
            ois.close();
            fin.close();
            System.out.println("Address is: " + addressObj);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
