package pl.java.wsei.lab5v8.test;

import pl.java.wsei.lab5v8.Infografika;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestInfografika {

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

        Infografika info = new Infografika(exItem);

        System.out.println("Tytuł: " + info.tytul);
        System.out.println("Adres strony: " + info.adresStrony);
        System.out.println("Adres grafiki: " + info.adresGrafiki);
        System.out.println("Adres miniaturki: " + info.adresMiniaturki);
        System.out.println("Rozmiar: " + info.wysokosc + " x " + info.szerokosc);

    }

}
