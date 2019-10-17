package com.company;


    public class Parcare1 {
        private int nrLocuriTotale=10;
        private int nrLocuriLibere;
        private int nrLocuriOcupate;
        private int  nrLocuriRezervate;

        Parcare1(int nrLocuriLibere, int nrLocuriOcupate, int nrLocuriRezervate) {
            this.nrLocuriLibere = nrLocuriLibere;
            this.nrLocuriOcupate = nrLocuriOcupate;
            this.nrLocuriRezervate = nrLocuriRezervate;


        }
        public int getNrLocuriTotale() {
            return this.nrLocuriTotale;
        }
        public void setNrLocuriTotale(int nrLocuriTotale){
            this.nrLocuriTotale = nrLocuriTotale;
        }
        public int getNrLocuriLibere() {
            return this.nrLocuriLibere;
        }

        public int getNrLocuriOcupate() {
            return this.nrLocuriOcupate;
        }

        public int getNrLocuriRezervate() {
            return this.nrLocuriRezervate;
        }


        public void setNrLocuriLibere(int nrLocuriLibere) {
            this.nrLocuriLibere = nrLocuriLibere;
        }

        public void setnrLocuriOcupate(int nrLocuriOcupate) {
            this.nrLocuriOcupate = nrLocuriOcupate;
        }

        public void setnrLocuriRezervate(int nrLocuriRezervate) {
            this.nrLocuriRezervate = nrLocuriRezervate;
        }
public String toString(){
            return "Parcarea de langa Green Hils are "+
                    nrLocuriTotale+" locuri de parcare dintre care sunt ocupate "+
                    nrLocuriOcupate+" , "+nrLocuriRezervate+
                    " sunt rezervate, deci au ramas "+nrLocuriLibere+
                    " locuri libere.";

}


    }


