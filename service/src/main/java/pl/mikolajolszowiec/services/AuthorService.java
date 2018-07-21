package pl.mikolajolszowiec.services;

import pl.mikolajolszowiec.models.Author;
import pl.mikolajolszowiec.persistences.AuthorDao;
import pl.mikolajolszowiec.persistences.IAuthorDao;

import java.io.IOException;
import java.util.List;

public class AuthorService implements IAuthorService {

    private final static IAuthorDao AUTHOR_DAO = new AuthorDao();

    public void create(Author author) throws IOException {
        AUTHOR_DAO.create(author);
    }

    public void delete(Long authorID) {
        AUTHOR_DAO.delete(authorID);
    }

    public List<Author> getAll() throws IOException {
        return AUTHOR_DAO.getAll();
    }

    public Author get(Long authorID) {
        return AUTHOR_DAO.get(authorID);
    }

    public void update(Author author, Long authorID) {
        AUTHOR_DAO.update(author,authorID);
    }
}
