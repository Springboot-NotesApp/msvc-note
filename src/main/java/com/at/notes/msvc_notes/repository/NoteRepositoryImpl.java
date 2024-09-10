package com.at.notes.msvc_notes.repository;

import com.at.notes.msvc_notes.models.Note;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class NoteRepositoryImpl implements INoteRepository {
    @Override
    public List<Note> findAll() {
        return List.of();
    }

    @Override
    public Optional<Note> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Note create(Note note) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public Long getNotesCount() {
        return 0L;
    }

    @Override
    public Note updateNote(String id, String title, String description) {
        return null;
    }
}
