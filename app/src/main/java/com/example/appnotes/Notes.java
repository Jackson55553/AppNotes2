package com.example.appnotes;

public class Notes {


    private String noteName;
    private String noteBody;
    private String noteDate;

    public String getNoteName() {
        return noteName;
    }

    public String getNoteBody() {
        return noteBody;
    }

    public String getNoteDate() {
        return noteDate;
    }

    public Notes(String noteName, String noteBody, String noteDate) {
        this.noteName = noteName;
        this.noteBody = noteBody;
        this.noteDate = noteDate;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public void setNoteBody(String noteBody) {
        this.noteBody = noteBody;
    }
}
