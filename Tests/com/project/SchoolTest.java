package com.project;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    School school = new School();
    Examen examen = new Examen("Resources/EngelsExamenVragen.txt");
    Student student = new Student("Peter");

    @Test
    void lijstExamen() {
        // arrange
        ArrayList<Examen> expected = new ArrayList<>();
        expected.add(examen);

        // act
        school.addExamen(examen);
        ArrayList<Examen> actual = school.getAlleExamens();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void addExamen() {
        // arrange
        Examen examen1 = new Examen("Resources/EngelsExamenVragen.txt");
        ArrayList<Examen> expected = new ArrayList<>();
        expected.add(examen1);

        // act
        school.addExamen(examen1);
        ArrayList<Examen> actual = school.getAlleExamens();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void lijstStudenten() {
        // arrange
        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student);

        // act
        school.addStudent(student);
        ArrayList<Student> actual = school.getAlleStudenten();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void addStudent() {
        // arrange

        // act

        // assert

    }

    @Test
    void makenStudent() {
        // arrange

        // act

        // assert

    }

    @Test
    void verwijderStudent() {
        // arrange
        ArrayList<Student> alleStudenten = new ArrayList<>();
        alleStudenten.add(student);
        alleStudenten.add(new Student("Daner"));
        alleStudenten.add(new Student("Dwayne"));

        // act
        System.out.print("Geef het studentnummer: \n");
        int nummer = 10000001;
        for (int i = 0; i < alleStudenten.size(); i++) {
            if (nummer == alleStudenten.get(i).getStudentenNummer()) {
                System.out.println(alleStudenten.get(i).getNaam() + " verwijdert.");
                alleStudenten.remove(i);
                break;
            }
        }

        // assert
        assertEquals(2, alleStudenten.size());

    }

    @Test
    void checkStudent() {
        // arrange
        ArrayList<Student> alleStudenten = new ArrayList<>();
        alleStudenten.add(student);
        alleStudenten.add(new Student("Daner"));
        alleStudenten.add(new Student("Dwayne"));

        Student methodeStudent = null;

        // act
        // vragen naar student
        System.out.print("Geef het studentnummer: ");
        int nummer = 10000002;

        // checken voor student
        for (Student student : alleStudenten) {
            // zoeken naar juiste student in alleStudenten
            if (nummer == student.getStudentenNummer()) {
                methodeStudent = student;
            }
            }

        if (student == null) {
            System.out.println("FOUT");
        }
        // assert
        assertEquals(nummer, methodeStudent.getStudentenNummer());

    }

    @Test
    void maakExamen() {
        // arrange

        // act

        // assert

    }

    @Test
    void welkeExamensGehaald() {
        // arrange

        // act

        // assert

    }

    @Test
    void meesteExamensGehaald() {
        // arrange
        School school = new School();
        student.addGeslaagdExamen(examen);
        school.addStudent(student);
        school.addStudent(new Student("Daner"));

        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student);


        // act
        ArrayList<Student> actual = new ArrayList<>();
        int meesteExamens = 0;
        for (Student student : school.getAlleStudenten()) {

            int examensGehaald = student.getGeslaagdeExamen().size();
            if (examensGehaald >= meesteExamens) {
                meesteExamens = examensGehaald;
            }
        }

        for (Student student : school.getAlleStudenten()) {
            if (student.getGeslaagdeExamen().size() >= meesteExamens) {
                actual.add(student);
            }
        }

        // assert
        assertEquals(expected, actual);

    }
}