package org.example;

public class DaTavolo extends Giochi{

    protected int giocatori;
    protected int durataM;


    public DaTavolo(int id, String titolo, int annoPubblicazione, double prezzo,int giocatori,int durataM) {
        super(id, titolo, annoPubblicazione, prezzo);
        this.giocatori=giocatori;
        this.durataM=durataM;
    }

    public int getGiocatori() {
        return giocatori;
    }

    public void setGiocatori(int giocatori) {
        this.giocatori = giocatori;
    }

    public int getDurataM() {
        return durataM;
    }

    public void setDurataM(int durataM) {
        this.durataM = durataM;
    }
}
