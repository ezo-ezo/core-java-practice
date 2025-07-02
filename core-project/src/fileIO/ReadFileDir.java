package fileIO;

import java.io.File;

public class ReadFileDir {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\utkar");
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.printf("%s  <DIR> \n", file.getName());

                } else {
                    System.out.printf("%s \n ", file.getName());
                }
            }
        } else {
            System.out.println("Directory not found.");
        }

        System.out.println("-------------------");
        String[] fileNames = folder.list();
        for (String fileName : fileNames) {
            File file = new File(folder, fileName);
            if (file.isDirectory()) {
                System.out.println(fileName + " <DIR>");
            } else {
                System.out.println(fileName);
            }
        }

    }
}

