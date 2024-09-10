package com.at.notes.msvc_notes.controllers;

import com.at.notes.msvc_notes.models.Note;
import com.at.notes.msvc_notes.models.dto.NoteDto;
import com.at.notes.msvc_notes.services.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/notes")
public class NoteController {

    @Autowired
    private INoteService service;

    @GetMapping(value = {"/", ""})
    public List<Note> getNotes() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Note> getNoteById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<Note> create(@RequestBody() Note note) {
        Note savedNote = service.create(note);
        return ResponseEntity.ok(savedNote);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        service.deleteById(id);
        return ResponseEntity.ok("Nota eliminada");
    }

    @GetMapping("/total")
    public Long getNoteCount() {
        return service.getNotesCount();
    }

    @PutMapping("/update/{id}")
    public Note updateNote(@PathVariable String id, @RequestBody() NoteDto noteDto) {
        return service.updateNote(id, noteDto.getTitle(), noteDto.getDescription());
    }

}
