package com.at.notes.msvc_notes.models;

import com.at.notes.msvc_notes.enums.NoteStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Note {
    private Long id;
    private String title;
    private String description;
    private NoteStatus status;
    private LocalDateTime createdAt;
    private Optional<LocalDateTime> updatedAt;
}
