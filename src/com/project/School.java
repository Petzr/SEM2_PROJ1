package com.project;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private ArrayList<Examen> alleExamens = new ArrayList<>();
    private ArrayList<Student> alleStudenten = new ArrayList<>();

    public School() {

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
            examen.toonExamenInfo();
        }
    }

    public void addExamen(Examen examen) {
        alleExamens.add(examen);
    }

    public void lijstStudenten() {
        System.out.println("Lijst met studenten:");
        for (Student student : alleStudenten) {
            student.toonStudent();
        }
    }

    public void addStudent(Student student) {
        alleStudenten.add(student);
    }

    public void makenStudent() {
        alleStudenten.add(new Student());
        System.out.println("Student toegevoegt!");
    }

    public void verwijderStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef het studentnummer: ");
        int nummer = scanner.nextInt();
        for (int i = 0; i < alleStudenten.size(); i++) {
            if (nummer == alleStudenten.get(i).getStudentenNummer()) {
                System.out.println(alleStudenten.get(i).getNaam() + " verwijdert.");
                alleStudenten.remove(i);
                break;
            }
        }
    }

    public Student checkStudent() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // vragen naar student
            System.out.print("Geef het studentnummer: ");
            int nummer;
            try {
                nummer = scanner.nextInt();
                scanner.nextLine();

                // checken voor student
                for (Student student : alleStudenten) {
                    // zoeken naar juiste student in alleStudenten
                    if (student.zoekStudent(nummer)) {
                        return student;
                    }
                }
            } catch (Exception e) {
                System.out.println("Geen getal ingevoerd");
                return null;
            }
        }
    }

    public void maakExamen() {
        Scanner scanner = new Scanner(System.in);

        Student student = checkStudent();
        if (student == null) {
            System.out.println("Geen correct student gevonden");
            return;
        }

        // keuze welk examen gemaakt word
        System.out.println("Welke examen wil je maken?");
        for (int i=0; i<alleExamens.size(); i++) {
            System.out.printf("%2d) %s\n", i+1, alleExamens.get(i).getNaam());
        }
        Examen examen = null;
        try {
            int keuze = scanner.nextInt();
            scanner.nextLine();

            examen = alleExamens.get(keuze-1);

        } catch (Exception e) {
            System.out.println("Geen correcte keuze");
            System.out.println("probeer het opnieuw");
            return;
        }


        // examen afnemen
        if (examen != null) {
            boolean isGeslaagd = examen.examenAfnemen();
            // examen behaald?
            if (isGeslaagd) {
                student.addGeslaagdExamen(examen);
            }
        }
    }

    public void welkeExamensGehaald() {
        Student student = checkStudent();
        if (student == null) {
            System.out.println("Geen correct student gevonden");
            return;
        }
       student.toonBehaaldeExamens();
    }

    public void meesteExamensGehaald() {
        int meesteExamens = 0;
        for (Student student : getAlleStudenten()) {

            int examensGehaald = student.getGeslaagdeExamen().size();
            if (examensGehaald >= meesteExamens) {
                meesteExamens = examensGehaald;
            }
        }

        for (Student student : getAlleStudenten()) {
            student.toonMeestBehaaldeExamens(meesteExamens);
        }
    }
}