package com.project;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private ArrayList<Examen> alleExamens = new ArrayList<>();
    private ArrayList<Student> alleStudenten = new ArrayList<>();

    public School(ArrayList<Examen> alleExamens, ArrayList<Student> alleStudenten) {
        this.alleExamens = alleExamens;
        this.alleStudenten = alleStudenten;
    }

    public School() {

    }

    public School(ArrayList<Student> alleStudenten) {
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
        for (Student student : alleStudenten) {
            System.out.println(student.getStudentenNummer() + ", " + student.getNaam());
        }
    }

    public void addStudent(Student student) {
        alleStudenten.add(student);
    }

    public void makenStudent() {
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
                    if (nummer == student.getStudentenNummer()) {
                        // controlleren of het juiste student is
                        System.out.println(student.getNaam() + ", bent jij dit? ja/nee");
                        String check = scanner.nextLine();
                        if (check.equals("ja")) {
                            return student;
                        }
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
            }
        }
    }

    public void welkeExamensGehaald() {
        Scanner scanner = new Scanner(System.in);
        Student student = checkStudent();
        System.out.println(student.getGeslaagdeExamen().size() >= 1 ? "Je hebt de volgende examens gehaald:" : "Je hebt geen examens gehaald.");
        for (int i = 0; i < student.getGeslaagdeExamen().size(); i++) {
            System.out.println(student.getGeslaagdeExamen().get(i).getNaam().substring(0, student.getGeslaagdeExamen().get(i).getNaam().length()-16));
        }
    }

    public void meesteExamensGehaald() {
        ArrayList<Student> studenten = new ArrayList<>();
        int meesteExamens = 0;
        for (Student student : getAlleStudenten()) {

            int examensGehaald = student.getGeslaagdeExamen().size();
            if (examensGehaald >= meesteExamens) {
                studenten.add(student);
                meesteExamens = examensGehaald;
            }
        }

        for (Student student : studenten) {
            System.out.printf("%d %s heeft %d examens gehaald\n", student.getStudentenNummer(), student.getNaam(), meesteExamens);
        }
    }
}
