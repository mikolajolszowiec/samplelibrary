package pl.mikolajolszowiec.entry;

import pl.mikolajolszowiec.controllers.AuthorController;

public class LibraryLauncher
{

    public static void main(String[] args)
    {
        AuthorController authorController = new AuthorController();
        authorController.create("Henryk", "Sienkiewicz", "Kraków");
        authorController.create("Adam", "Mickiewicz", "Poznań");
        authorController.getAll().stream().forEach(System.out::println);



    }


}
