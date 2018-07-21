package pl.mikolajolszowiec.services;

import pl.mikolajolszowiec.models.Book;
import pl.mikolajolszowiec.models.Borrow;

import java.util.List;

public interface IBorrowService {

    void create(Borrow borrow);
    void delete(Long borrowID);
    List<Book> getAll();
    Book get(Long borrowID);
    void update(Borrow borrow, Long borrowID);

}
