package org.example;

import org.example.Enum.Piattaforma;
import org.example.Enum.Genere;

public class Videogioco extends Gioco {

    Piattaforma p;
    protected int durataO;
    Genere g;

    public Videogioco(int id, String titolo, int annoPubblicazione, double prezzo, Piattaforma p, int durataO, Genere g) {
        super(id, titolo, annoPubblicazione, prezzo);
        this.p=p;
        this.durataO=durataO;
        this.g=g;
    }

    public Piattaforma getP() {
        return p;
    }

    public void setP(Piattaforma p) {
        this.p = p;
    }

    public int getDurataO() {
        return durataO;
    }

    public void setDurataO(int durataO) {
        this.durataO = durataO;
    }

    public Genere getG() {
        return g;
    }

    public void setG(Genere g) {
        this.g = g;
    }

    @Override
    public String toString() {
        return "Videogioco{" +
                "piattaforma=" + p +
                ", durataO=" + durataO +
                ", g=" + g +
                ", id=" + id +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", prezzo=" + prezzo +
                '}';
    }
}
