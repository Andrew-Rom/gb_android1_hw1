package org.example.notebook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Notebook {
    protected static ArrayList<Note> notes = new ArrayList<>();

    public void createNewNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter note > ");
        String textNote = scanner.nextLine();
        int idNote = NoteId.getId();
        Date dateNote = new Date();
        Note note = new Note(textNote, dateNote, idNote);
        saveNote(note.getInfo());
        notes.add(note);
    }

    private void saveNote(String text) {
        File file = new File("Notebook.txt");
        try {
            file.createNewFile();
        } catch (Exception ignored) {
            throw new RuntimeException();
        }
        try (FileWriter fw = new FileWriter("Notebook.txt", true)) {
            fw.write(text + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
