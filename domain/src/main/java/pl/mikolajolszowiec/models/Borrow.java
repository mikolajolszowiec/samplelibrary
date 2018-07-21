package pl.mikolajolszowiec.models;

import java.text.DateFormat;

public class Borrow {

    //Borrow(data wypożyczenia, relacja do Książki i Wypożyczającego (id lub obiekt)
    private Long borrowID;
    private DateFormat borrowDate;
    private Long bookID;
    private Long borrowerID;
    private boolean returned;


}
