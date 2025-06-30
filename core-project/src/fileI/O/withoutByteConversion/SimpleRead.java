package fileI.O.withoutByteConversion;
import java.io.*;

public class SimpleRead {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("abc.txt");
        int i;
        while((i = fr.read()) != -1){
            System.out.print((char)i);
        }

        fr.close();
    }
}
