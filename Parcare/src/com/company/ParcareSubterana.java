package com.company;

public class ParcareSubterana extends Parcare1 {
    private int nrInvalidePlaces;
    private int nrBikePlaces;

    ParcareSubterana(int nrLocuriLibere, int nrLocuriOcupate, int nrLocuriRezervate, int nrInvalidePlaces, int nrBikePlaces){
        super(nrLocuriLibere,nrLocuriOcupate,nrLocuriRezervate);
        this.nrInvalidePlaces = nrInvalidePlaces;
        this.nrBikePlaces = nrBikePlaces;
    }

    public int getNrInvalidePlaces() {
        return this.nrInvalidePlaces = nrInvalidePlaces;
    }

    public int getNrBikePlaces() {
        return this.nrBikePlaces = nrBikePlaces;
    }
    public void setNrInvalidePlaces(int nrInvalidePlaces) {
        this.nrInvalidePlaces = nrInvalidePlaces;
    }

    public void setNrBikePlaces(int nrBikePlaces) {
        this.nrBikePlaces = nrBikePlaces;
    }

    public String toString(){
        return "Parcarea de langa Linella are "+
                getNrLocuriTotale()+" locuri de parcare dintre care sunt ocupate "+
                getNrLocuriOcupate()+" , "+getNrLocuriRezervate()+
                " sunt rezervate, deci au ramas "+getNrLocuriLibere()+
                " locuri libere aici in subteran mai sunt  "+nrInvalidePlaces+
                " locuri pentru invalizi si "+nrBikePlaces+" locuri pentru ciclisti.";

    }

}
