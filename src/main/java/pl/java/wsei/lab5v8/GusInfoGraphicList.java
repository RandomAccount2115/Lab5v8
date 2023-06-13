package pl.java.wsei.lab5v8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GusInfoGraphicList {

    public ArrayList<Infografika> inforgrafiki;

    public GusInfoGraphicList(String gusFileName){

        inforgrafiki = new ArrayList();
        String contents;

        try {
            contents = new String(Files.readAllBytes(Paths.get(gusFileName)));
        }
        catch (IOException e){
            System.out.println("Błąd wczytywania pliku gusInfoGraphic.xml =>" + e.getLocalizedMessage());
            e.printStackTrace();
            contents = "";
        }

        String[] items = contents.split("<item>");

        for (int i = 0; i < items.length; i++){

            inforgrafiki.add(new Infografika(items[i]));

        }

    }



}
