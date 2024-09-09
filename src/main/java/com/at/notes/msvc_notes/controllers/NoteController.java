package com.at.notes.msvc_notes.controllers;

import com.at.notes.msvc_notes.models.Note;
import com.at.notes.msvc_notes.repository.INoteRepositoryMongoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    @Autowired
    private INoteRepositoryMongoDB repository;

    @GetMapping()
    public List<Note> getNotes() {
//        return service.getAll();
        return List.of(null);
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id) {
//        return service.findById(id);
        return null;
    }

    @PostMapping("/create")
    public Note create(@RequestBody() Note note) {
        return repository.save(note);
    }

}
