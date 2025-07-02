package fileI.O.withoutByteConversion;

import java.io.FileWriter;

public class AppendFile {
    public static void main(String[] args) {
        String filePath = "f1.txt";
        String Append = "File appendeddd.\n";

        try {
            FileWriter fWriter = new FileWriter("f1.txt");
            fWriter.write(Append);
            fWriter.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
