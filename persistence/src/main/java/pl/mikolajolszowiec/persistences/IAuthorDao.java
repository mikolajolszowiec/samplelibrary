package pl.mikolajolszowiec.persistences;

import pl.mikolajolszowiec.models.Author;

import java.io.IOException;
import java.util.List;

public interface IAuthorDao {

    void create(Author author) throws IOException;

    void delete(Long authorID) throws IOException;

    List<Author> getAll() throws IOException;

    Author get(Long authorID) throws IOException;

    void update(Author author, Long authorID) throws IOException;

}
