package com.project;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private ArrayList<Examen> alleExamens = new ArrayList<>();
    private static ArrayList<Student> alleStudenten = new ArrayList<>();

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

    public static void lijstStudenten() {
        System.out.println("Lijst met studenten:");
        for (Student student : alleStudenten)
        {
            System.out.println(student.getStudentenNummer() + ", " + student.getNaam());
        }
    }

    public static void makenStudent()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef naam: ");
        String naam = scanner.nextLine();
        Integer nummer = Student.getStudentenNummer();
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
}