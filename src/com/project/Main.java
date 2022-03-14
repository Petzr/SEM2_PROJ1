package com.project;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void lijstExamen(Examen engels, Examen wiskunde) {
        System.out.println("Examen: "+ engels.getNaam() +", Aantal vragen: "+ engels.getVragen().size());
        System.out.println("Examen: "+ wiskunde.getNaam() +", Aantal vragen: "+ wiskunde.getVragen().size());
    }

    public static void lijstStudenten() {

    }

    public static Student nieuwStudent(String naam, int studentenNummer) {
        return new Student(naam, studentenNummer);
    }

    public static void verwijderStudent() {

    }

    public static void examenMaken(Examen engels, Examen wiskunde) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welk examen wilt u maken? kies uit");
        lijstExamen(engels, wiskunde);
        String examen = scanner.nextLine();
        if (examen.equals("engels")) {

        }
        else if (examen.equals("wiskunde")) {

        }
        else {
            System.out.println("geen optie");
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

        ArrayList<Student> studenten = new ArrayList<>();
        studenten.add(nieuwStudent("Peter", 21092036));


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

        // lijst examen
        if (input == 1) {
            lijstExamen(engels, wiskunde);


        }

        // lijst studenten
        else if (input == 2) {

        }

        // nieuwe student maken
        else if (input == 3) {

            System.out.println("Naam student: ");
            String naam = scanner.nextLine();
            System.out.println("Studenten nummer: ");
            int studentennummer = scanner.nextInt();
            scanner.nextLine();
            studenten.add(nieuwStudent(naam, studentennummer));

        }

        // student verwijderen
        else if (input == 4) {

            System.out.println("Studenten nummer van student die u wilt verwijderen: ");
            int studentennummer = scanner.nextInt();
            scanner.nextLine();

        }

        // examen maken
        else if (input == 5) {
            examenMaken(engels, wiskunde);

        }

        // is student geslaagd voor examen
        else if (input == 6) {

        }

        //welk examen heeft student gemaakt
        else if (input == 7) {

        }

        // meeste examens gehaald
        else if (input == 8) {

        }

        // exit
        else if (input == 0) {

        } else {
            System.out.println("GEEN OPTIE");
        }
    }

}
