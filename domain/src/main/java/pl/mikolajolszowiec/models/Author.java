package pl.mikolajolszowiec.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Author {
        //Author(imię, nazwisko, miejsce urodzenia)
    private Long authorID;
    private String name;
    private String surname;
    private String birthPlace;
    private boolean deleted;

    public Author() {
    }

    public Author(String name, String surname, String birthPlace) {
        this.name = name;
        this.surname = surname;
        this.birthPlace = birthPlace;
        this.deleted = false;
    }

    public Author(Long authorID, String name, String surname, String birthPlace) {
        this.authorID = authorID;
        this.name = name;
        this.surname = surname;
        this.birthPlace = birthPlace;
        this.deleted = false;
    }

}
