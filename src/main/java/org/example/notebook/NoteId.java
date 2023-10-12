package org.example.notebook;

public class NoteId {
    public static Integer noteId = 0;

    public static int getId() {
        noteId++;
        return noteId;
    }
}
