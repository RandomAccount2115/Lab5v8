package pl.java.wsei.lab5v8.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFileRead {

    public static void main(String[] args){

        try {
            String contents = new String(Files.readAllBytes(Paths.get("src/main/resources/pl/java/wsei/lab5v8/gusInfoGraphic.xml")));
            System.out.println("Zawartość pliku gusInfoGraphic.xml");
            System.out.println(contents);
        }
        catch (IOException e){
            System.out.println("Błąd wczytywania pliku gusInfoGraphic.xml =>" + e.getLocalizedMessage());
            e.printStackTrace();
        }

    }

}
