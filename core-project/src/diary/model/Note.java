package diary.model;

import java.io.Serializable;

public class Note implements Serializable {
    private static final long serialVersionUID = 11L;

    private String title;
    private String content;
    private String date;

    public Note(String title, String content, String date){
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getDate(){
        return date;
    }
}
