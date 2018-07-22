package pl.mikolajolszowiec.view;

import com.sun.javafx.binding.StringFormatter;

public class ManuView extends View{

    private final String VIEW_NAME = "Menu";

    public String printMenu()
    {
        StringBuilder stringBuilder = new StringBuilder(String.format(super.printMenu(),VIEW_NAME));


        return stringBuilder.toString();
    }


}
