package pl.mikolajolszowiec.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Borrower {

    //Borrower(imię, nazwisko, adres, numer telefonu, email)
    private Long borrowerID;
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;
    private String email;
    private boolean deleted;



}
