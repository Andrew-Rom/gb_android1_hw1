package org.example.notebook;

import java.util.Date;

public class Note {
    protected String noteText;
    protected Date noteDate;
    protected int noteId;

    public Note(String noteText, Date noteDate, int noteId) {
        this.noteText = noteText;
        this.noteDate = noteDate;
        this.noteId = noteId;
    }

    public String getInfo() {
        return String.format("ID: %d, Date: %s, Text: %s", noteId, noteDate, noteText);
    }
}
