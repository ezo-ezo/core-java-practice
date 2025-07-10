package diary.dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import diary.model.Note;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DiaryFileHandler {
    final static String filePath = "D:\\CoreJava\\myDiary";

    public boolean saveNoteToFile(Note note){
        File file = new File(filePath + note.getDate() + ".txt");
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, true)) ) {
            oos.writeObject(note);
            return true;
        } catch (IOException e) {
            System.out.println("Error saving note: " + e.getMessage());
        }
        return false;
    }

    public Note readNote(String text){
        File file = new File(filePath + text + ".txt");
        if(!file.exists()){
            System.out.println("File not found!");
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (Note) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading note: " + e.getMessage());
        }
     return null;
    }
}
