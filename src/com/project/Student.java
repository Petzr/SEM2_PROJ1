package com.project;

import java.util.ArrayList;

public class Student {

    private String naam;
    private static int studentenNummer = 10000000;
    private ArrayList<Examen> geslaagdVoorExamens = new ArrayList<>();
    private static ArrayList<Integer> alleStudentenNummers = new ArrayList<>();

    public Student(String naam, int studentenNummer) {
        this.naam = naam;
        this.studentenNummer = studentenNummer;
    }

    public String getNaam() {
        return naam;
    }
    public static int getStudentenNummer() {
        return studentenNummer++;
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