package com.at.notes.msvc_notes.controllers;

import com.at.notes.msvc_notes.models.Note;
import com.at.notes.msvc_notes.services.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
