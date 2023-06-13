package pl.java.wsei.lab5v8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {

    public String tytul;
    public String adresStrony;
    public String adresGrafiki;
    public String adresMiniaturki;
    public int szerokosc;
    public int wysokosc;


    public Infografika(String title){

        Pattern pattern = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher matcher = pattern.matcher(title);

        if (matcher.find()){
            tytul = matcher.group(1);
        }


        pattern = Pattern.compile("<link>(.*)</link>");
        matcher = pattern.matcher(title);

        if (matcher.find()){
            adresStrony = matcher.group(1);
        }


        pattern = Pattern.compile("<media:content[^>]url=.(.*?\\\")");
        matcher = pattern.matcher(title);

        if (matcher.find()){
            adresGrafiki = matcher.group(1).replace('\"', ' ');
        }


        pattern = Pattern.compile("<media:thumbnail[^>]url=.(.*?\\\")");
        matcher = pattern.matcher(title);

        if (matcher.find()){
            adresMiniaturki = matcher.group(1).replace('\"', ' ');;
        }


        pattern = Pattern.compile("width=\"(.*)\" height");
        matcher = pattern.matcher(title);

        if (matcher.find()){
            szerokosc = Integer.parseInt(matcher.group(1));
        }


        pattern = Pattern.compile("height=\"(.*)\"");
        matcher = pattern.matcher(title);

        if (matcher.find()){
            wysokosc = Integer.parseInt(matcher.group(1));
        }

    }

    public void print(){

        System.out.println("Infografika:");
        System.out.println("\tTytuł: " + tytul);
        System.out.println("\tAdres strony: " + adresStrony);
        System.out.println("\tAdres grafiki: " + adresGrafiki);
        System.out.println("\tAdres miniaturki: " + adresMiniaturki);
        System.out.println("Rozmiar: " + wysokosc + " x " + szerokosc);

        System.out.println();

    }


}
