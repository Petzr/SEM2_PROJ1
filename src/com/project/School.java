package com.project;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private ArrayList<Examen> alleExamens = new ArrayList<>();
    private ArrayList<Student> alleStudenten = new ArrayList<>();

    public School(ArrayList<Examen> alleExamens, ArrayList<Student> alleStudenten)
    {
        this.alleExamens = alleExamens;
        this.alleStudenten = alleStudenten;
    }

    public School(){

    }

    public School(ArrayList<Student> alleStudenten)
    {
        this.alleStudenten = alleStudenten;
    }

    public ArrayList<Examen> getAlleExamens() {
        return alleExamens;
    }
    public ArrayList<Student> getAlleStudenten() {
        return alleStudenten;
    }

    public void lijstExamen() {
        System.out.println("Lijst met examens:");
        for (Examen examen : alleExamens) {
            System.out.printf(
                    "Examen naam: %s, aantal vragen bij examen: %d\n", examen.getNaam(), examen.getVragen().size());
        }

    }

    public void addExamen(Examen examen) {
        alleExamens.add(examen);
    }

    public void lijstStudenten() {
        System.out.println("Lijst met studenten:");
        for (Student student : alleStudenten)
        {
            System.out.println(student.getStudentenNummer() + ", " + student.getNaam());
        }
    }

    public void addStudent(Student student) {
        alleStudenten.add(student);
    }

    public void makenStudent()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef naam: ");
        String naam = scanner.nextLine();
        Integer nummer = Student.getUniekNummer();
        alleStudenten.add(new Student(naam, nummer));
        System.out.println("Student toegevoegt!");
    }

    public void verwijderStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef het studentnummer: ");
        int nummer = scanner.nextInt();
        for (int i = 0; i < alleStudenten.size(); i++)
        {
            if (nummer == alleStudenten.get(i).getStudentenNummer())
            {
                System.out.println(alleStudenten.get(i).getNaam() + " verwijdert.");
                alleStudenten.remove(i);
                break;
            }
        }
    }

    public void maakExamen() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef het studentnummer: ");
        int nummer = scanner.nextInt();
        scanner.nextLine();

        // checken voor student
        for (Student student : alleStudenten) {

            // zoeken naar juiste student in alleStudenten
            if (nummer == student.getStudentenNummer()) {
                // checken of juiste student
                System.out.println(student.getNaam() +", bent jij dit? ja/nee");
                String check = scanner.nextLine();
                if (check.equals("ja")) {

                    // keuze welk examen gemaakt word
                    System.out.println("Welke examen wil je maken? engels/wiskunde");
                    String keuze = scanner.nextLine();
                    Examen examen = null;
                    if (keuze.equals("wiskunde")) {
                        examen = alleExamens.get(1);
                    } else if (keuze.equals("engels")) {
                        examen = alleExamens.get(0);
                    }

                    // examen afnemen
                    if (examen != null) {
                        boolean isGeslaagd = examen.examenAfnemen();
                        // examen behaald?
                        if (isGeslaagd) {
                            student.addGeslaagdExamen(examen);
                            return;
                        }
                    }

                }
            }
        }
    }
}