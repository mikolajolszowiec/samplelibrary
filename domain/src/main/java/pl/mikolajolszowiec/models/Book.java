package pl.mikolajolszowiec.models;

public class Book {
    //Book(tytuł, data wydania, isbn, listę słownikowych gatunków (enum), ilość stron, krótki opis, relacje do Autora (id lub obiekt))


    private Long bookID;
    private String title;
    private int publishDate;
    private String isbn;
    private int pagesCount;
    private String description;
    private Long authorID;
    private boolean deleted;



}
