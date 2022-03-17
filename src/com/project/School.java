package com.project;

import java.util.ArrayList;

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
}