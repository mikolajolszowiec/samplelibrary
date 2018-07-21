package pl.mikolajolszowiec.controllers;

import pl.mikolajolszowiec.models.Author;
import pl.mikolajolszowiec.services.AuthorService;
import pl.mikolajolszowiec.services.IAuthorService;

import java.io.IOException;
import java.util.List;

public class AuthorController {

    private static final IAuthorService AUTHOR_SERVICE = new AuthorService();

    public void create(String name, String surname, String birthPlace) {
        Author author = new Author(name, surname, birthPlace);
        try {
            AUTHOR_SERVICE.create(author);
        } catch (IOException e) {
            System.out.println("Błąd");
        }
    }

    public void delete(Long authorID) {
        AUTHOR_SERVICE.delete(authorID);
    }

    public List<Author> getAll() {
        try {
            return AUTHOR_SERVICE.getAll();
        } catch (IOException e) {
            System.out.println("Błąd");
            return null;
        }
    }

    public Author get(Long authorID) {
        return AUTHOR_SERVICE.get(authorID);
    }

    public void update(String name, String surname, String birthPlace, Long authorID) {
        Author author = new Author(name, surname, birthPlace);
        AUTHOR_SERVICE.update(author, authorID);
    }

}
