package com.at.notes.msvc_notes.repository;

import com.at.notes.msvc_notes.models.Note;

import java.util.List;
import java.util.Optional;

public interface INoteRepository {
    List<Note> findAll();
    Optional<Note> findById(String id);
    Note create(Note note);
    void deleteById(String id);
    Long getNotesCount();
}
