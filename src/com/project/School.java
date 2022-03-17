package com.project;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    ArrayList<Examen> alleExamens = new ArrayList<>();
    ArrayList<Student> alleStudenten = new ArrayList<>();

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
}