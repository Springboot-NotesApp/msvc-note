package com.at.notes.msvc_notes.repository;

import com.at.notes.msvc_notes.models.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class INoteRepositoryMongoImpl implements INoteRepository {

    @Autowired
    private INoteRepositoryMongoDB repository;

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
        return repository.save(note);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public Long getNotesCount() {
        return repository.count();
    }
}
