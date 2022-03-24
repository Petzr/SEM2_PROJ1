package com.project;

import java.io.File;
import java.io.FileNotFoundException;
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
        } catch (FileNotFoundException e) {
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

    public boolean examenAfnemen() {
        Scanner scanner = new Scanner(System.in);

        // welkom bericht voor het maken van het exmanen
        System.out.println("\n\n\n\n\n\n*************************************");
        System.out.println("Welkom bij het examen "+ getNaam());
        System.out.println("Het examen heeft "+ getVragen().size() +" vragen. Succes");
        System.out.println("Klik ENTER om te beginnen");
        scanner.nextLine();

        // start van alle vragen in de file
        int vragenGoed = 0;
        for (Vraag vraag : getVragen()) {
            System.out.println(vraag.getVraag());

            String antwoord = scanner.nextLine();
            if (antwoord.equals(vraag.getAntwoord())) {
                System.out.print("Goed, ");
                vragenGoed++;
            }
            else {
                System.out.print("Fout, ");
            }
            System.out.println("Het goede antwoord is: "+ vraag.getAntwoord() +"\n");
        }

        // einde examen met puntentelling en bericht
        System.out.println("*************************************");
        System.out.println("Dat was het einde van het examen.");
        System.out.println("Je hebt "+ vragenGoed +" vragen goed.");
        System.out.println("Je hebt meer dan "+ getAantalVragen()/2 +" antwoorden goed nodig om te slagen.");

        return isGeslaagdVoorExamen(vragenGoed);

    }

    public boolean isGeslaagdVoorExamen(int punten) {
        if (punten > this.getAantalVragen()/2) {
            System.out.println("Goed gedaan, je hebt het examen gehaald.");
            return true;
        } else {
            System.out.println("Helaas, je hebt het examen niet gehaald.");
            return false;
        }
    }

}

