package pl.java.wsei.lab5v8.test;

import pl.java.wsei.lab5v8.GusInfoGraphicList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestGusInfoGraphicList {

    public static void main(String[] args){

        GusInfoGraphicList list = new GusInfoGraphicList("src/main/resources/pl/java/wsei/lab5v8/gusInfoGraphic.xml");

        for (int i = 0; i < list.inforgrafiki.size(); i++){

            list.inforgrafiki.get(i).print();

        }

    }

}
