package com.project;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String naam;
    private int studentenNummer;
    private static Integer uniekNummer = 10000000;

    private ArrayList<Examen> geslaagdVoorExamens = new ArrayList<>();

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer hier je naam in: ");
        this.naam = scanner.nextLine();
        this.studentenNummer = getUniekNummer();
    }

    public Student(String naam) {
        this.naam = naam;
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

    public void toonBehaaldeExamens(){
        System.out.println(getGeslaagdeExamen().size() >= 1 ? "Je hebt de volgende examens gehaald:" : "Je hebt geen examens gehaald.");

        for (int i = 0; i < getGeslaagdeExamen().size(); i++) {
            System.out.println(getGeslaagdeExamen().get(i).getNaam().substring(0,getGeslaagdeExamen().get(i).getNaam().length()-16));
        }
    }
    public void toonStudent(){

        System.out.println(getNaam() + ", " + getStudentenNummer());
    }

    public void addGeslaagdExamen(Examen examen) {
        geslaagdVoorExamens.add(examen);
    }

    public Boolean zoekStudent(int nummer)
    {
        // checken voor student
        Scanner scanner = new Scanner(System.in);
        if (nummer == studentenNummer)
        {
            // controlleren of het juiste student is
            System.out.println(naam + ", bent jij dit? ja/nee");
            String check = scanner.nextLine();
            if (check.equals("ja"))
            {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void toonMeestBehaaldeExamens(int meesteExamens) {

        if (getGeslaagdeExamen().size() >= meesteExamens) {
            System.out.printf("%d %s heeft %d examens gehaald\n",
                    getStudentenNummer(), getNaam(), getGeslaagdeExamen().size());
        }
    }
}