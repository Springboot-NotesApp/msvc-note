package com.at.notes.msvc_notes.repository;

import com.at.notes.msvc_notes.enums.NoteStatus;
import com.at.notes.msvc_notes.models.Note;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Repository
@Primary
public class NoteRepositoryImpl implements INoteRepository {

    private final List<Note> notes = Arrays.asList(
        new Note(1L, "Comprar nevera", "Comprar nevera en daka", NoteStatus.HIGH, LocalDateTime.now(), null),
        new Note(2L, "Clases", "Teleproceso II", NoteStatus.LOW, LocalDateTime.now(), null),
        new Note(1L, "Comprar regulador", "Comprar regulador en daka", NoteStatus.MEDIUM, LocalDateTime.now(), null)
    );

    @Override
    public List<Note> getAll() {
        return notes;
    }

    @Override
    public Note findById(Long id) {
        return notes.stream().filter(note -> note.getId().equals(id)).findFirst().orElseThrow();
    }
}
