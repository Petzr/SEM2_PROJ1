package com.project;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Examen {

    private String naam;
    private ArrayList<Vraag> vragen = new ArrayList<>();

    public Examen(String naam, ArrayList<Vraag> vragen) {
        this.naam = naam;
        this.vragen = vragen;
    }
    // deze constructor leek mij (peter) handiger omdat het direct uit een file kan lezen
    public Examen(String pathname) {

        try {
            File file = new File(pathname);
            Scanner scanner = new Scanner(file);

            // aanmaken van de naam doormiddel van de naam van de file
            naam = file.getName();

            // aanmaken van de vragen in de file
            while (scanner.hasNext()) {
                Vraag vraag = new Vraag(scanner.nextLine(), scanner.nextLine());
                vragen.add(vraag);

            }
        }
        catch (Exception e) {
            System.out.println(e);
        }




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
    // de toString heb ik toegevoegd om snel te kunnen lezen wat er in het object wordt opgeslagen voor de tests
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

