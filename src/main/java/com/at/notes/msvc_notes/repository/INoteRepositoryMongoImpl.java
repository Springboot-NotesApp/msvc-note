package com.at.notes.msvc_notes.repository;

import com.at.notes.msvc_notes.models.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class INoteRepositoryMongoImpl implements INoteRepository {

    @Autowired
    private INoteRepositoryMongoDB repository;

    @Autowired
    private MongoTemplate mongoTemplate;

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

    @Override
    public Note updateNote(String id, String title, String description) {
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = new Update();

        // Si hay titulo se actualiza
        if(title != null && !title.isBlank()) {
            update.set("title", title);
        }

        // Si hay descripcion se actualiza
        if(description != null && ! description.isBlank()) {
            update.set("description", description);
        }

        // Para devolver el documento actualizado
        return mongoTemplate.findAndModify(query, update, new FindAndModifyOptions().returnNew(true), Note.class);
    }
}
