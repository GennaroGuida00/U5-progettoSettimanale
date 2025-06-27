package org.example;

import org.example.Enum.Genere;
import org.example.Enum.Piattaforma;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


public class Collezione {
    List<Gioco> giochi = new ArrayList<>();
    Scanner in=new Scanner(System.in);

    public void aggiungiElemento(Gioco g) {


      if(!giochi.contains(g)) {
          giochi.add(g);
          System.out.println("Elemento aggiunto");
      }
      else
          System.out.println("Elemento già presente");
    }

    public Optional<Gioco> ricercaElemento(int id) {

        Optional<Gioco> stream= giochi.stream().filter(g->g.getId()==id).findFirst();
        if(stream.isPresent()) {
            System.out.println(stream.get());
        }
        else
            System.out.println("Non è presente");
        return stream;
    }

    public void ricercaPerPrezzo(Double prezzo){
        giochi.stream().filter(p->p.getPrezzo()<prezzo).forEach(System.out::println);

    }

    public void ricercaPerGiocatori(int giocatori){
        giochi.stream().filter(g->g instanceof DaTavolo).map(g->(DaTavolo) g).filter(daTavolo -> daTavolo.getGiocatori()==giocatori).forEach(System.out::println);
    }

    public void rimuoviElemento(int id){
        giochi.remove(id-1);
        giochi.forEach(System.out::println);
    }

    public void aggiornaElemento(int id) {
        Optional<Gioco> elementoTrovato = ricercaElemento(id);

        if (elementoTrovato.isPresent()) {
            Gioco elementoDaModficare = elementoTrovato.get();

            if (elementoDaModficare instanceof Videogioco) {
                System.out.println("inserisci id");
                elementoDaModficare.setId(in.nextInt());
                in.nextLine();

                System.out.println("inserisci titolo");
                elementoDaModficare.setTitolo(in.nextLine());

                System.out.println("inserisci Anno di pubblicazione");
                elementoDaModficare.setAnnoPubblicazione(in.nextInt());
                in.nextLine();

                System.out.println("inserisci prezzo");
                elementoDaModficare.setPrezzo(in.nextDouble());
                in.nextLine();

                Piattaforma piattaforma = null;
                do {
                    System.out.println("Inserisci piattaforma tra: PC, PS5, XBOX, SWITCH");
                    String input = in.nextLine().toUpperCase();
                    try {
                        piattaforma = Piattaforma.valueOf(input);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Piattaforma non valida, riprova.");
                    }
                } while (piattaforma == null);

                ((Videogioco) elementoDaModficare).setP(piattaforma);

                System.out.println("inserisci durata in ore");
                ((Videogioco) elementoDaModficare).setDurataO(in.nextInt());
                in.nextLine();

                Genere genere = null;
                do {
                    System.out.println("Inserisci genere tra: SPORT, AZIONE, AVVENTURA, HORROR");
                    String input = in.nextLine().toUpperCase();
                    try {
                        genere = Genere.valueOf(input);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Genere non valido, riprova.");
                    }
                } while (genere == null);

                ((Videogioco) elementoDaModficare).setG(genere);
            }

            if (elementoDaModficare instanceof DaTavolo) {
                System.out.println("inserisci id");
                elementoDaModficare.setId(in.nextInt());
                in.nextLine();

                System.out.println("inserisci titolo");
                elementoDaModficare.setTitolo(in.nextLine());

                System.out.println("inserisci Anno di pubblicazione");
                elementoDaModficare.setAnnoPubblicazione(in.nextInt());
                in.nextLine();

                System.out.println("inserisci prezzo");
                elementoDaModficare.setPrezzo(in.nextDouble());
                in.nextLine();

                System.out.println("inserisci durata in minuti");
                ((DaTavolo) elementoDaModficare).setDurataM(in.nextInt());
                in.nextLine();

                System.out.println("inserisci numero giocatori");
                ((DaTavolo) elementoDaModficare).setGiocatori(in.nextInt());
                in.nextLine();
            }


            System.out.println("Elemento aggiornato:");
            System.out.println(elementoDaModficare);

        } else {
            System.out.println("Elemento non trovato.");
        }
    }

    public void statistiche(){
        giochi.stream()
    }


}




