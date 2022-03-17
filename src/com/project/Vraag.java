package com.project;

public class Vraag {
    private String vraag;
    private String antwoord;

    public Vraag(String vraag, String antwoord) {
        this.vraag = vraag;
        this.antwoord = antwoord;
    }
    public Vraag(String vraag) {
        this.vraag = vraag;
    }

    public String getVraag() {
        return vraag;
    }
    public String getAntwoord() {
        return antwoord;
    }


    @Override
    public String toString() {
        return "{" +
                "vraag='" + vraag + '\'' +
                ", antwoord='" + antwoord + '\'' +
                '}';
    }
}

