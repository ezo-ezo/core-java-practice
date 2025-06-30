package fileIO;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySerializer {
    public static void main(String[] args) {
        Address addressObj =  new Address("Pune", "India");
        try {
            FileOutputStream fout = new FileOutputStream("D:\\temp_java\\address.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(addressObj);
            oos.close();
            fout.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
