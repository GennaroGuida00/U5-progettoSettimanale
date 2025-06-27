package org.example;

import org.example.Enum.Genere;
import org.example.Enum.Piattaforma;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {



        Collezione c =new Collezione();

        c.aggiungiElemento(new Videogioco(1,"pes",2025,75, Piattaforma.PC,65, Genere.SPORT));
        c.aggiungiElemento(new Videogioco(2,"TLOU",2015,60, Piattaforma.PS5,135, Genere.AVVENTURA));
        c.aggiungiElemento(new Videogioco(3,"Tekken7",2005,65, Piattaforma.XBOX,165, Genere.AZIONE));
        c.aggiungiElemento(new Videogioco(4,"Until Dawn",2017,75, Piattaforma.PS5,615, Genere.HORROR));
        c.aggiungiElemento(new Videogioco(5,"MarioKart",2025,85, Piattaforma.SWITCH,230, Genere.SPORT));

        c.aggiungiElemento(new DaTavolo(6,"Cluedo",1990,35,6,120));
        c.ricercaElemento(1);

        c.ricercaPerPrezzo(70.0);

        c.ricercaPerGiocatori(6);
        System.out.println("----------------------------------------------------------------");
        c.rimuoviElemento(4);

        c.aggiornaElemento(5);


    }
}
