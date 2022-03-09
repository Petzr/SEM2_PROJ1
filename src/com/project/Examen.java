package com.project;

import java.util.ArrayList;

public class Examen {

    private String naam;
    private ArrayList<Vraag> vragen = new ArrayList<>();

    public Examen(String naam, ArrayList<Vraag> vragen) {
        this.naam = naam;
        this.vragen = vragen;
    }
    public Examen(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }
    public ArrayList<Vraag> getVragen() {
        return vragen;
    }

    public void setVragen(ArrayList<Vraag> vragen) {
        this.vragen = vragen;
    }
    @Override
    public String toString() {
        return "Examen: "+ naam +", aantal vragen: "+ vragen.size();
    }
}

class Vraag {
    private String vraag;
    private String antwoord;

    public Vraag(String vraag, String antwoord) {
        this.vraag = vraag;
        this.antwoord = antwoord;
    }

    public String getVraag() {
        return vraag;
    }
    public String getAntwoord() {
        return antwoord;
    }

}

