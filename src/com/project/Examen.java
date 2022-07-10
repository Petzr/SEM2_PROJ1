package com.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Examen {

    private String naam;
    private ArrayList<Vraag> vragen = new ArrayList<>();

    public String getNaam() {
        return naam;
    }

    public ArrayList<Vraag> getVragen() {
        Collections.shuffle(vragen); // Zorgt ervoor dat er een willekeurige volgorde zit in de vragen.

        return vragen;
    }

    public int getAantalVragen() {
        return vragen.size();
    }

    public Examen(String pathname) {

        try {
            File file = new File(pathname);
            Scanner scanner = new Scanner(file);

            // aanmaken van de naam doormiddel van de naam van de file
            naam = file.getName();

            // aanmaken van de vragen in de file
            if (naam.contains("MQC")) {
                while (scanner.hasNext()) {
                    String VraagString = scanner.nextLine();
                    if (VraagString.contains("?")) {


                        String Antwoord = VraagString;
                        Antwoord = Antwoord.substring(Antwoord.indexOf("(") + 1);
                        Antwoord = Antwoord.substring(0, Antwoord.indexOf(")"));

                        //Hier wordt gecheckt of de vraag een MQC is.
                        if (Antwoord.toLowerCase().equals("a") || Antwoord.toLowerCase().equals("b") || Antwoord.toLowerCase().equals("c") || Antwoord.toLowerCase().equals("d")) {
                        // 4x scanner.nextline voor het uitprinten van antwoordopties A t/m D.
                            List optieLijst = new ArrayList();
                            optieLijst.add(scanner.nextLine());
                            optieLijst.add(scanner.nextLine());
                            optieLijst.add(scanner.nextLine());
                            optieLijst.add(scanner.nextLine());

                            //Vraag,correcte antwoord, antwoorden.
                            Vraag vraag = new MQC(VraagString.substring(0, VraagString.length() - 3), Antwoord, optieLijst);
                            vragen.add(vraag);
                        } else {
                            //Vraag,correct antwoord.
                            Vraag vraag = new Vraag(VraagString.substring(0, VraagString.length() - 3), scanner.nextLine());
                            vragen.add(vraag);

                        }
                    }


                }
            } else {
                while (scanner.hasNext()) {
                    Vraag vraag = new Vraag(scanner.nextLine(), scanner.nextLine());
                    vragen.add(vraag);

                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public boolean examenAfnemen() {
        Scanner scanner = new Scanner(System.in);

        // welkom bericht voor het maken van het exmanen
        System.out.println("\n\n\n\n\n\n*************************************");
        System.out.println("Welkom bij het examen " + getNaam());
        System.out.println("Het examen heeft " + getVragen().size() + " vragen. Succes");
        System.out.println("Klik ENTER om te beginnen");
        scanner.nextLine();

        // start van alle vragen in de file
        int vragenGoed = 0;
        for (Vraag vraag : getVragen()) {
            vragenGoed += vraag.beantwoordVraag();
        }

        // einde examen met puntentelling en bericht
        System.out.println("*************************************");
        System.out.println("Dat was het einde van het examen.");
        System.out.println("Je hebt " + vragenGoed + " vragen goed.");
        System.out.println("Je hebt meer dan " + getAantalVragen() / 2 + " antwoorden goed nodig om te slagen.");
        System.out.println("Klik ENTER om te sluiten");
        scanner.nextLine();

        return isGeslaagdVoorExamen(vragenGoed);
    }

    public boolean isGeslaagdVoorExamen(int punten) {
        if (punten > getAantalVragen() / 2) {
            System.out.println("Goed gedaan, je hebt het examen gehaald.");
            return true;
        } else {
            System.out.println("Helaas, je hebt het examen niet gehaald.");
            return false;
        }
    }

    public void toonExamenInfo() {
        System.out.printf("Examen naam: %s, aantal vragen bij examen: %d\n", getNaam(), getVragen().size());
    }
}



