package com.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String naam;
    private int studentenNummer;
    private static Integer uniekNummer = 10000000;

    private ArrayList<Examen> geslaagdVoorExamens = new ArrayList<>();
    private static ArrayList<Integer> alleStudentenNummers = new ArrayList<>();

    public Student(String naam) {
        this.naam = naam;
        this.studentenNummer = getUniekNummer();
    }

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer hier je naam in: ");
        this.naam = scanner.nextLine();
        this.studentenNummer = getUniekNummer();
    }

    public String getNaam() {
        return naam;
    }

    public static int getUniekNummer() {
        uniekNummer++;
        return uniekNummer;
    }
    public int getStudentenNummer() {
        return studentenNummer;
    }

    public ArrayList<Examen> getGeslaagdeExamen() {
        return geslaagdVoorExamens;
    }
    public static ArrayList<Integer> getAlleStudentenNummers() {
        return alleStudentenNummers;
    }

    public void addGeslaagdExamen(Examen examen) {
        geslaagdVoorExamens.add(examen);
    }
}