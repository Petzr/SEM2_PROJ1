package com.project;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
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
    void verwijderStudent() { // test het verwijderen van een student door input uit console
        // arrange
        school.addStudent(student);
        school.addStudent(new Student("Daner"));
        school.addStudent(new Student("Dwayne"));

        // act
        InputStream inputStream = new ByteArrayInputStream("10000002".getBytes());
        System.setIn(inputStream);

        school.verwijderStudent();


        // assert
        assertEquals(2, school.getAlleStudenten().size());


    }

    @Test
    void checkStudent() // test of het opvragen van de juiste student goed verloopt door input uit de console
    {
        school.addStudent(student);

        Student student1 = null;
        // vragen naar student
        System.out.print("Geef het studentnummer: ");
        int nummer;
        try {
            nummer = 10000001; // normaal met scanner ingevoerd

            // checken voor student
            for (Student student : school.getAlleStudenten()) {
                // zoeken naar juiste student in alleStudenten

                InputStream in = new ByteArrayInputStream("ja".getBytes());
                System.setIn(in);

                if (student.zoekStudent(nummer)) {
                    student1 = student;
                }
            }
        } catch (Exception e) {
            System.out.println("Geen getal ingevoerd");
            student1 = null;
        }

        assertEquals(student, student1);
    }

    @Test
    void meesteExamensGehaald() { // test of daadwekelijk de gegeven student het meeste examens heeft gehaald van alle studenten
        // arrange
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