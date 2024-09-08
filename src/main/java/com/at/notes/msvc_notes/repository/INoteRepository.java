package com.at.notes.msvc_notes.repository;

import com.at.notes.msvc_notes.models.Note;

import java.util.List;

public interface INoteRepository {
    List<Note> getAll();
    Note findById(Long id);
}
