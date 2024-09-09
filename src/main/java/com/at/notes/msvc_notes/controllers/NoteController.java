package com.at.notes.msvc_notes.controllers;

import com.at.notes.msvc_notes.models.Note;
import com.at.notes.msvc_notes.repository.INoteRepositoryMongoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/notes")
public class NoteController {

    @Autowired
    private INoteRepositoryMongoDB repository;

    @GetMapping(value = {"/", ""})
    public List<Note> getNotes() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Note> getNoteById(@PathVariable String id) {
        return repository.findById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<Note> create(@RequestBody() Note note) {
        Note savedNote = repository.save(note);
        return ResponseEntity.ok(savedNote);
    }

}
