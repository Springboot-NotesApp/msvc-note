package com.at.notes.msvc_notes.services;

import com.at.notes.msvc_notes.models.Note;
import com.at.notes.msvc_notes.repository.INoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements INoteService {

    @Autowired
    private INoteRepository repository;

    @Override
    public List<Note> getAll() {
        return repository.getAll();
    }

    @Override
    public Note findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void create(Note note) {
        repository.create(note);
    }
}
