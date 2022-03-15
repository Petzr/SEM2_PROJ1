package com.project;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void menu(ArrayList<Student> array) // ER IS NU MAAR 1 ARRAYLIST PARAMETER MAAR ER KOMEN WAARSCHIJNLIJK MEER IN DE PARAMETER (DANER)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print(
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
        int input = scanner.nextInt();
        switch (input) {
            case 1: ; break;
            case 2: lijstStudenten(array); menu(array); break;
            case 3: nieuwStudent(array); menu(array); break;
            case 4: verwijderStudent(array); menu(array); break;
            case 5: ; break;
            case 6: ; break;
            case 7: ; break;
            case 8: ; break;
            case 0:
                System.out.println("Fijne dag nog verder!"); break;
            default:
                System.out.println("Probeer het opnieuw!"); menu(array); break;
        }
    }

    public static void lijstExamen() {

    }

    public static void lijstStudenten(ArrayList<Student> array) {
        System.out.println("Lijst met studenten:");
        for (Student student : array)
        {
            System.out.println(student.getStudentenNummer() + " " + student.getNaam());
        }
    }

    public static void nieuwStudent(ArrayList<Student> array)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef naam: ");
        String naam = scanner.nextLine();
        Integer nummer = StudentNummer.getNummer();
        array.add(new Student(naam, nummer));
        System.out.println("Student toegevoegt!");
    }

    public static void verwijderStudent(ArrayList<Student> array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef het studentnummer: ");
        int nummer = scanner.nextInt();
        for (int i = 0; i < array.size(); i++)
        {
            if (nummer == array.get(i).getStudentenNummer())
            {
                System.out.println(array.get(i).getNaam() + " verwijdert.");
                array.remove(i);
                break;
            } else {}
        }
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
        Scanner scanner = new Scanner(System.in);
        Examen engels = new Examen("Resources/EngelsExamenVragen.txt");
        Examen wiskunde = new Examen("Resources/WiskundeExamenVragen.txt");
        ArrayList<Student> lijstStudent = new ArrayList<>();

        // begin programma


        menu(lijstStudent); // ER IS NU MAAR 1 ARRAYLIST PARAMETER MAAR ER KOMEN WAARSCHIJNLIJK MEER IN DE PARAMETER (DANER)
    }

}
