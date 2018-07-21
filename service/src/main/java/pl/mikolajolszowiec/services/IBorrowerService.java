package pl.mikolajolszowiec.services;

import pl.mikolajolszowiec.models.Book;
import pl.mikolajolszowiec.models.Borrower;

import java.util.List;

public interface IBorrowerService {

    void create(Borrower borrower);
    void delete(Long borrowerID);
    List<Book> getAll();
    Book get(Long borrowerID);
    void update(Borrower borrower, Long borrowerID);
}
