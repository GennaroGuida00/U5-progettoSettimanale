package org.example;

import org.example.Enum.Genere;
import org.example.Enum.Piattaforma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application  {


    public static void main(String[] args) {


        Scanner in=new Scanner(System.in);
        Collezione c =new Collezione();
        int scelta = 0;


        c.aggiungiElemento(new Videogioco(1,"pes",2025,75, Piattaforma.PC,65, Genere.SPORT));
        c.aggiungiElemento(new Videogioco(1,"TLOU",2015,60, Piattaforma.PS5,135, Genere.AVVENTURA));
        c.aggiungiElemento(new Videogioco(3,"Tekken7",2005,65, Piattaforma.XBOX,165, Genere.AZIONE));
        c.aggiungiElemento(new Videogioco(4,"Until Dawn",2017,75, Piattaforma.PS5,615, Genere.HORROR));
        c.aggiungiElemento(new Videogioco(5,"MarioKart",2025,85, Piattaforma.SWITCH,230, Genere.SPORT));

        c.aggiungiElemento(new DaTavolo(6,"Cluedo",1990,35,6,120));



        System.out.println("Scegli quale operazione compiere e premi 0 per uscire");
        do {
            System.out.println("1) Ricerca elemento per id");
            System.out.println("2) Ricerca elemento per prezzo(tutti quelli inferiori al prezzo indicato)");
            System.out.println("3) Ricerca elemento per numero giocatori");
            System.out.println("4) Rimuovi un elemento tramite id");
            System.out.println("5) Aggiorna un elemento esistente tramite id");
            System.out.println("6) Stampa le statistiche");
            System.out.println("7) Stampa la lista di elementi");

            scelta=in.nextInt();
            switch (scelta){



                case 1:
                    System.out.println("----------------------------------------------------------------");
                    c.ricercaElemento();
                    break;
                case 2:
                    System.out.println("----------------------------------------------------------------");
                    c.ricercaPerPrezzo();
                    break;
                case 3:
                    System.out.println("----------------------------------------------------------------");
                    c.ricercaPerGiocatori();
                    break;
                case 4:
                    System.out.println("----------------------------------------------------------------");
                    c.rimuoviElemento();
                    break;
                case 5:
                    System.out.println("----------------------------------------------------------------");
                    c.aggiornaElemento();
                    break;
                case 6:
                    System.out.println("----------------------------------------------------------------");
                    c.statistiche();
                    break;
                case 7:
                    System.out.println("----------------------------------------------------------------");
                    c.stampaElementi();
                    break;

            }

        }
        while (scelta!=0);


    }
}
