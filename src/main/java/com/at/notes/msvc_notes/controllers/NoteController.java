package com.at.notes.msvc_notes.controllers;

import com.at.notes.msvc_notes.models.Note;
import com.at.notes.msvc_notes.services.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NoteController {

    @Autowired
    private INoteService service;

    @GetMapping("/notes")
    public List<Note> getNotes() {
        return service.getAll();
    }

    @GetMapping("/notes/{id}")
    public Note getNoteById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/notes/create")
    public ResponseEntity<?> create(@RequestBody() Note data) {
        service.create(data);
        return new ResponseEntity<String>("Created", HttpStatus.CREATED);
    }

}
