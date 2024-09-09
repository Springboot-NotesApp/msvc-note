package com.at.notes.msvc_notes.models;

import com.at.notes.msvc_notes.enums.NoteStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Optional;

@Document("Notes")
public class Note {
    @Id
    private String id;
    private String title;
    private String description;
//    private NoteStatus status;
//    private LocalDateTime createdAt;
//    private Optional<LocalDateTime> updatedAt;

    public Note(String id, String title, String description) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
//        this.status = status;
//        this.createdAt = LocalDateTime.now();
//        this.updatedAt = Optional.empty();
    }
}
