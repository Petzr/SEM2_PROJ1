package com.project;

import java.util.ArrayList;

public class Student {

    private String naam;
    private String studentenNummer;
    private static ArrayList<String> alleStudentenNummers;
    private ArrayList<Examen> geslaagdeExamen;

    public Student(String naam, String studentenNummer) {
        this.naam = naam;
        this.studentenNummer = studentenNummer;
    }

    public String getNaam() {
        return naam;
    }
    public String getStudentenNummer() {
        return studentenNummer;
    }
    public ArrayList<Examen> getGeslaagdeExamen() {
        return geslaagdeExamen;
    }
}
