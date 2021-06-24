package com.example.appnotes;

import java.util.ArrayList;
import java.util.List;

public class NotesRepository {

    List<Notes> getNotes() {
        ArrayList<Notes> result = new ArrayList<>();
        result.add(new Notes("note1", "body1", "20.02.21"));
        result.add(new Notes("note2", "body2", "20.02.21"));
        result.add(new Notes("note3", "body3", "20.02.21"));
        result.add(new Notes("note4", "body4", "20.02.21"));
        return result;
    }

}
