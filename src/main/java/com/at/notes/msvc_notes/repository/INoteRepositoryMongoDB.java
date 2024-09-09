package com.at.notes.msvc_notes.repository;

import com.at.notes.msvc_notes.models.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INoteRepositoryMongoDB extends MongoRepository<Note, String> {

}
