package org.example;

import Enum.Piattaforma;
import Enum.Genere;

import java.time.LocalDate;

public class Videogiochi extends Giochi{

    Piattaforma p;
    protected int durataO;
    Genere g;

    public Videogiochi(int id, String titolo, int annoPubblicazione, double prezzo,Piattaforma p,int durataO, Genere g) {
        super(id, titolo, annoPubblicazione, prezzo);
        this.g=g;
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
}
