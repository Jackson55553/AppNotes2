package com.example.appnotes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import java.util.List;

public class FragmentNotes extends Fragment {

    private NotesRepository notesRepository;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        notesRepository = new NotesRepository();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notes, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout notesList = view.findViewById(R.id.notes_list_container);

        List<Notes> notes = notesRepository.getNotes();

        for (Notes note : notes) {
            View itemView = LayoutInflater.from(requireContext()).inflate(R.layout.item_note, notesList, false);
            CardView noteName = itemView.findViewById(R.id.note_resource);

            TextView cardTitle = itemView.findViewById(R.id.title_card);
            TextView cardBody = itemView.findViewById(R.id.body_card);
            TextView cardData = itemView.findViewById(R.id.data_card);
            cardData.setText(note.getNoteDate());
            cardTitle.setText(note.getNoteName());
            cardBody.setText(note.getNoteBody());

            notesList.addView(itemView);
            noteName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getParentFragmentManager()
                            .beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.main, new NoteInfoFragment(), null)
                            .commit();
                }
            });
        }

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

}