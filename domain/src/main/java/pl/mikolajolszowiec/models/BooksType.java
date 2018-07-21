package pl.mikolajolszowiec.models;

public enum BooksType{
    HORROR("Horror"),
    THRILLER("Thriller"),
    ROMANCE("Romance"),
    HISTORY("History"),
    CRIME("Crime"),
    FAIRYTALE("Fairytale"),
    SCIENCE_FICTION("Science Fiction"),
    TRAVEL("Travel");

    private String text;

    BooksType(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
