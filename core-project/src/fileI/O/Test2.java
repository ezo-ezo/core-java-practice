package fileI.O;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("f1.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Sachin is not my favourite player";
        byte b[] = s.getBytes();
        bout.write(b);

        bout.flush();
        bout.close();
        fout.close();

        System.out.println("Success");
    }
}
