package pl.mikolajolszowiec.services;

import pl.mikolajolszowiec.models.Book;

import java.util.List;

public interface IBookService {

    void create(Book book);
    void delete(Long bookID);
    List<Book> getAll();
    Book get(Long bookID);
    void update(Book book, Long bookID);

}
