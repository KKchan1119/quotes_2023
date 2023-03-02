package org.example;

public class WiseList {
    private int id;
    private String content;
    private String writerName;
    public WiseList(int id, String content, String writerName){
        this.id = id ;
        this.content = content;
        this.writerName = writerName;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getWriterName() {
        return writerName;
    }
}
