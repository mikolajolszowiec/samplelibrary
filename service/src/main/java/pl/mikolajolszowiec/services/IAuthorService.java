package pl.mikolajolszowiec.services;

import pl.mikolajolszowiec.models.Author;

import java.io.IOException;
import java.util.List;

public interface IAuthorService {

    void create(Author author) throws IOException;
    void delete(Long authorID);
    List<Author> getAll() throws IOException;
    Author get(Long authorID);
    void update(Author author, Long authorID);

}
