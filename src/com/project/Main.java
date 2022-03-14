package com.project;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void lijstExamen() {

    }

    public static void lijstStudenten(ArrayList<Student> array) {
        for (int i = 0; i < array.size(); i++)
        {
            System.out.println(array.get(i).getStudentenNummer() + " " + array.get(i).getNaam());
        }
    }

    public static void nieuwStudent(ArrayList<Student> array)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef naam: ");
        String naam = scanner.nextLine();
        System.out.print("Geef studentnummer: ");
        int nummer = scanner.nextInt();
        array.add(new Student(naam, nummer));
    }

    public static void verwijderStudent() {
    }

    public static void examenMaken(Examen examen) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welkom bij het examen "+ examen.getNaam());
        System.out.println("Het examen heeft "+ examen.getVragen().size() +"\n");
        System.out.println("type ANNULEREN om te stoppen met het examen. Ready? ");

        int vragenGoed = 0;
        for (Vraag vraag : examen.getVragen()) {
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

        if (vragenGoed < examen.getVragen().size()/2) {
            System.out.println("Helaas, je hebt het examen niet gehaald.");
        }
        else {
            System.out.println("Goed gedaan, je hebt het examen gehaald.");
        }


    }

    public static void studentGeslaagd() {

    }

    public static void examenBehaaldDoorStudent() {

    }

    public static void meesteExamenGehaald() {

    }

    public static void main(String[] args) {
        Examen engels = new Examen("Resources/EngelsExamenVragen.txt");
        Examen wiskunde = new Examen("Resources/WiskundeExamenVragen.txt");

        ArrayList<Student> lijstStudent = new ArrayList<>();
        nieuwStudent(lijstStudent);
        nieuwStudent(lijstStudent);
        System.out.println(lijstStudent.size());


        // begin programma
        System.out.println(
                        "1) Lijst met examens\n" +
                        "2) Lijst met studenten\n" +
                        "3) Nieuwe student inschrijven\n" +
                        "4) Student verwijderen\n" +
                        "5) Examen afnemen\n" +
                        "6) Is student geslaagd voor test?\n" +
                        "7) Welke examens heeft student gehaald?\n" +
                        "8) Welke student heeft de meeste examens gehaald?\n" +
                        "0) Exit\n" +
                        "Uw keuze: ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input) {
            case 1: ; break;
            case 2: ; break;
            case 3: ; break;
            case 4: ; break;
            case 5: ; break;
            case 6: ; break;
            case 7: ; break;
            case 8: ; break;
            case 0: ; break;
            default: ; break;
        }
    }

}
