package org.example;

import org.example.Enum.Genere;
import org.example.Enum.Piattaforma;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Collezione {
    List<Gioco> giochi = new ArrayList<>();
    Scanner in=new Scanner(System.in);

    public void aggiungiElemento(Gioco g) {

        Stream<Gioco> listid=giochi.stream().filter(l->l.getId()==g.getId());
        if (listid.count()>0){
            System.out.println("Elemento con quest'id già presente");
        }
        else {
            giochi.add(g);
            System.out.println("elemento aggiunto");
        }


    }

    public Optional<Gioco> ricercaElemento() {
        System.out.println("Inserisci l'id dell'elemento da cercare:");
        int id = in.nextInt();
        in.nextLine();

        Optional<Gioco> stream= giochi.stream().filter(g->g.getId()==id).findFirst();
        if(stream.isPresent()) {
            System.out.println(stream.get());
        }
        else
            System.out.println("Non è presente");
        return stream;
    }

    public void ricercaPerPrezzo(){
        System.out.println("Inserisci il prezzo dell'elemento da cercare:");
        double prezzo = in.nextDouble();
        in.nextLine();
        List<Gioco> risultati =giochi.stream().filter(p->p.getPrezzo()<prezzo).collect(Collectors.toList());
        risultati.forEach(System.out::println);


    }

    public void ricercaPerGiocatori(){
        System.out.println("Inserisci dei giocatori:");
        int giocatori = in.nextInt();
        in.nextLine();
        List<Gioco> risultati =giochi.stream().filter(g->g instanceof DaTavolo).map(g->(DaTavolo) g).filter(daTavolo -> daTavolo.getGiocatori()==giocatori).collect(Collectors.toList());
        risultati.forEach(System.out::println);
    }

    public void rimuoviElemento(){
        System.out.println("Inserisci l'id dell'elemento da eliminare:");
        int id = in.nextInt();
        in.nextLine();
        boolean eliminare= giochi.removeIf(e->e.getId()==id);
        if (eliminare)
            System.out.println("Elemento eliminato");
        else
            System.out.println("non presente");

    }

    public void aggiornaElemento() {

        System.out.println("Inserisci l'id dell'elemento da aggiornare:");
        int id = in.nextInt();
        in.nextLine();

        Optional<Gioco> elementoTrovato = giochi.stream().filter(g -> g.getId() == id).findFirst();

        if (elementoTrovato.isPresent()) {
            Gioco elementoDaModficare = elementoTrovato.get();

            if (elementoDaModficare instanceof Videogioco) {
                boolean input = false;

                System.out.println("inserisci id");
                while (!input) {
                    try {
                        elementoDaModficare.setId(in.nextInt());
                        in.nextLine(); // consuma newline
                        input = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Errore: inserisci un id valido numerico");
                        in.nextLine();
                    }
                }

                input = false;
                System.out.println("inserisci titolo");
                while (!input) {
                    try {
                        elementoDaModficare.setTitolo(in.nextLine());
                        input = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Errore: inserisci un titolo valido");
                        in.nextLine();
                    }
                }

                input = false;
                System.out.println("inserisci Anno di pubblicazione");
                while (!input) {
                    try {
                        elementoDaModficare.setAnnoPubblicazione(in.nextInt());
                        in.nextLine();
                        input = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Errore: inserisci un anno valido");
                        in.nextLine();
                    }
                }

                input = false;
                System.out.println("inserisci prezzo");
                while (!input) {
                    try {
                        elementoDaModficare.setPrezzo(in.nextDouble());
                        in.nextLine();
                        input = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Errore: inserisci un prezzo valido");
                        in.nextLine();
                    }
                }

                Piattaforma piattaforma = null;
                do {
                    System.out.println("Inserisci piattaforma tra: PC, PS5, XBOX, SWITCH");
                    String inputP = in.nextLine().toUpperCase();
                    try {
                        piattaforma = Piattaforma.valueOf(inputP);
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
                    String inputP = in.nextLine().toUpperCase();
                    try {
                        genere = Genere.valueOf(inputP);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Genere non valido, riprova.");
                    }
                } while (genere == null);

                ((Videogioco) elementoDaModficare).setG(genere);
            }

            if (elementoDaModficare instanceof DaTavolo) {
                boolean input = false;

                System.out.println("inserisci id");
                while (!input) {
                    try {
                        elementoDaModficare.setId(in.nextInt());
                        in.nextLine();
                        input = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Errore: inserisci un id valido numerico");
                        in.nextLine();
                    }
                }

                input = false;
                System.out.println("inserisci titolo");
                while (!input) {
                    try {
                        elementoDaModficare.setTitolo(in.nextLine());
                        input = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Errore: inserisci un titolo valido");
                        in.nextLine();
                    }
                }

                input = false;
                System.out.println("inserisci Anno di pubblicazione");
                while (!input) {
                    try {
                        elementoDaModficare.setAnnoPubblicazione(in.nextInt());
                        in.nextLine();
                        input = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Errore: inserisci un anno valido");
                        in.nextLine();
                    }
                }
            }
        }
    }


                    public void statistiche(){
        DoubleSummaryStatistics stats=  giochi.stream()
                .collect(Collectors.summarizingDouble(Gioco::getPrezzo));
        System.out.println("Numero Elementi:" +stats.getCount());
        System.out.println("Prezzo più alto:" +stats.getMax());
        System.out.println("Prezzo medio:" +stats.getAverage());

    }

    public void stampaElementi(){
giochi.stream().forEach(System.out::println);    }

}




