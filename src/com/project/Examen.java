package com.project;

import java.util.ArrayList;

public class Examen {

    private String naam;
    private ArrayList<Vraag> vragen = new ArrayList<>();

    public Examen(String naam, ArrayList<Vraag> vragen) {
        this.naam = naam;
        this.vragen = vragen;
    }

    public String getNaam() {
        return naam;
    }
    public ArrayList<Vraag> getVragen() {
        return vragen;
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

