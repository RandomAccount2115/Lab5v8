package pl.java.wsei.lab5v8.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegEx {

    public static void main(String[] args){

        String exItem = "<item>\n" +
                "\t\t\t<title><![CDATA[Infografika - Światowy Dzień Bezpieczeństwa i Ochrony Zdrowia w Pracy]]></title>\n" +
                "\t\t\t<pubDate><![CDATA[Fri, 28 Apr 2023 12:00:00 +0200]]></pubDate>\n" +
                "\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-swiatowy-dzien-bezpieczenstwa-i-ochrony-zdrowia-w-pracy,122,1.html</link>\n" +
                "\t\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-swiatowy-dzien-bezpieczenstwa-i-ochrony-zdrowia-w-pracy,122,1.html</guid>\n" +
                "\t\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/122/1/1/swiatowy_dzien_bezpieczenstwa_i_ochrony_zdrowia_w_pracy_slider_pl.jpg\" type=\"image/jpeg\" width=\"1230\" height=\"691\">\n" +
                "\t\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n" +
                "\t\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/122/1/1/swiatowy_dzien_bezpieczenstwa_i_ochrony_zdrowia_w_pracy_slider_pl,k1uUwl-caFOE6tCTiHtf.jpg\" />\n" +
                "\t\t\t</media:content>\n" +
                "\t\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/122/1/1/swiatowy_dzien_bezpieczenstwa_i_ochrony_zdrowia_w_pracy_slider_pl,k1uUwl-caFOE6tCTiHtf.jpg\" alt=\"\" width=\"280\" height=\"212\"/></div>]]></description>\n" +
                "\t\t</item>";

        Pattern pattern = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher matcher = pattern.matcher(exItem);

        if (matcher.find()){
            System.out.println("Znaleziono tytuł: " + matcher.group(1));
        }
        else {
            System.out.println("Nie znaleziono tytułu");
        }

        pattern = Pattern.compile("<link>(.*)");
        matcher = pattern.matcher(exItem);

        if (matcher.find()){
            System.out.println("Znaleziono adres strony: " + matcher.group(1));
        }
        else {
            System.out.println("Nie znaleziono tytułu");
        }

        pattern = Pattern.compile("<media:content[^>]url=.(.*?\\\")");
        matcher = pattern.matcher(exItem);

        if (matcher.find()){
            System.out.println("Znaleziono adres grafiki: " + matcher.group(1));
        }
        else {
            System.out.println("Nie znaleziono tytułu");
        }

        pattern = Pattern.compile("<media:thumbnail[^>]url=.(.*?\\\")");
        matcher = pattern.matcher(exItem);

        if (matcher.find()){
            System.out.println("Znaleziono adres miniaturki: " + matcher.group(1));
        }
        else {
            System.out.println("Nie znaleziono tytułu");
        }

        pattern = Pattern.compile("width=\"(.*)\" height");
        matcher = pattern.matcher(exItem);

        if (matcher.find()){
            System.out.println("Znaleziono szerokość: " + matcher.group(1));
        }
        else {
            System.out.println("Nie znaleziono tytułu");
        }

        pattern = Pattern.compile("height=\"(.*)\"");
        matcher = pattern.matcher(exItem);

        if (matcher.find()){
            System.out.println("Znaleziono wysokosc: " + matcher.group(1));
        }
        else {
            System.out.println("Nie znaleziono tytułu");
        }

    }

}
