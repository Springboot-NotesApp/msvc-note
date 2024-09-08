package com.at.notes.msvc_notes.services;

import com.at.notes.msvc_notes.models.Note;

import java.util.List;

public interface INoteService {
    List<Note> getAll();
    Note findById(Long id);
}
