package com.project;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Examen {

    private String naam;
    private ArrayList<Vraag> vragen = new ArrayList<>();

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
    public int getAantalVragen() {
        return vragen.size();
    }

    public void examenAfnemen() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welkom bij het examen "+ getNaam());
        System.out.println("Het examen heeft "+ getVragen().size() +"\n");

        int vragenGoed = 0;
        for (Vraag vraag : getVragen()) {
            System.out.println(vraag.getVraag());

            if (scanner.nextLine().equals(vraag.getAntwoord())) {
                System.out.println("Goed, ");
                vragenGoed++;
            }
            else {
                System.out.println("Fout, ");
            }
            System.out.println("Het goede antwoord is: "+ vraag.getAntwoord());
        }
        System.out.println("Dat was het einde van het examen.");
        System.out.println("Je hebt "+ vragenGoed +" vragen goed.");

        if (isGeslaagdExamen(vragenGoed)) {
            System.out.println("Helaas, je hebt het examen niet gehaald.");
        }
        else {
            System.out.println("Goed gedaan, je hebt het examen gehaald.");
        }


    }

    public boolean isGeslaagdExamen(int punten) {
        if (punten < this.getAantalVragen()) {
            return true;
        }
        return false;
    }

}

