package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Collezione {
    List<Gioco> giochi = new ArrayList<>();

    public void aggiungiElemento(Gioco g) {


      if(!giochi.contains(g)) {
          giochi.add(g);
          System.out.println("Elemento aggiunto");
      }
      else
          System.out.println("Elemento già presente");
    }

    public void ricercaElemento(int id) {

        Optional<Gioco> stream= giochi.stream().filter(g->g.getId()==id).findFirst();
        if(stream.isPresent()) {
            System.out.println(stream.get());
        }
        else
            System.out.println("Non è presente");
    }

    public void ricercaPerPrezzo(Double prezzo){
        giochi.stream().filter(p->p.getPrezzo()<prezzo).forEach(System.out::println);

    }

    public void ricercaPerGiocatori(int giocatori){
        giochi.stream().filter(g->g.)
    }


}
