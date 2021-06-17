package com.example.appnotes;

import java.util.ArrayList;
import java.util.List;

public class NotesRepository {

    List<Notes> getNotes() {
    ArrayList<Notes> result = new ArrayList<>();
        result.add(new Notes("note1", "body1","20.02.21"));
        result.add(new Notes("note2", "body1","20.02.21"));
        result.add(new Notes("note3", "body1","20.02.21"));
        result.add(new Notes("note4", "body1","20.02.21"));
        return result;
    }

}
