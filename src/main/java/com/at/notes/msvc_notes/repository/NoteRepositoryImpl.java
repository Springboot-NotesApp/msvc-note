package com.at.notes.msvc_notes.repository;

import com.at.notes.msvc_notes.models.Note;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class NoteRepositoryImpl implements INoteRepository {

    private List<Note> notes;

    public NoteRepositoryImpl() {
        notes = new ArrayList<>(Arrays.asList(
                new Note(UUID.randomUUID().toString(), "Comprar nevera", "Comprar nevera en daka"),
                new Note(UUID.randomUUID().toString(), "Clases", "Teleproceso II"),
                new Note(UUID.randomUUID().toString(), "Comprar regulador", "Comprar regulador en daka")
        ));
    }

    @Override
    public List<Note> getAll() {
        return notes;
    }

    @Override
    public Note findById(Long id) {
//        return notes.stream().filter(note -> note.().equals(id)).findFirst().orElseThrow();
        return null;
    }

    @Override
    public void create(Note note) {
        this.notes.add(note);
    }
}
