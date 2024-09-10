package com.at.notes.msvc_notes.services;

import com.at.notes.msvc_notes.models.Note;
import com.at.notes.msvc_notes.repository.INoteRepositoryMongoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteServiceImpl implements INoteService {

    @Autowired
    private INoteRepositoryMongoImpl repository;

    @Override
    public List<Note> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Note> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Note create(Note note) {
        return repository.create(note);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public Long getNotesCount() {
        return repository.getNotesCount();
    }

    @Override
    public Note updateNote(String id, String title, String description) {
        return repository.updateNote(id, title, description);
    }

}
