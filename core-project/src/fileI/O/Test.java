package fileI.O;

import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("me.txt");
            String s = "Only i am awsm";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success...");
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
