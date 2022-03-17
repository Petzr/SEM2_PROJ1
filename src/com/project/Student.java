package com.project;

import java.util.ArrayList;

public class Student {

    private String naam;
    private int studentenNummer;
    private static ArrayList<Integer> alleStudentenNummers;
    private ArrayList<Examen> geslaagdeExamen = new ArrayList<>();

    public Student(String naam, int studentenNummer) {
        this.naam = naam;
        this.studentenNummer = studentenNummer;
    }
    public Student(String naam) {
        this.naam = naam;

    }

    public String getNaam() {
        return naam;
    }
    public int getStudentenNummer() {
        return studentenNummer;
    }
    public ArrayList<Examen> getGeslaagdeExamen() {
        return geslaagdeExamen;
    }

    public void addGeslaagdExamen(Examen examen) {
        geslaagdeExamen.add(examen);
    }
}

class StudentNummer
{
    private static Integer laatsteNummer = 10000000;
    private Integer nummer;

    public static Integer getNummer() {
        Integer nummer = laatsteNummer + 1;
        laatsteNummer = nummer;
        return nummer;
    }
}