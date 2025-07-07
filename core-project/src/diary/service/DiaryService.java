package diary.service;

import diary.dal.DiaryFileHandler;
import diary.model.Note;

public class DiaryService {
    private DiaryFileHandler fileHandler = new DiaryFileHandler();

    public boolean addNote(Note note) {
        // Logic to add a note
        
        return fileHandler.saveNoteToFile(note);
        // This could involve creating a Note object and saving it to a file or database
    }
}
