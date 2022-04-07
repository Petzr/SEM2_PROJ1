package com.project;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void addGeslaagdExamen() {
        Examen wiskunde = new Examen("Resources/WiskundeExamenVragen.txt");
        Student daner = new Student("Daner");
        daner.addGeslaagdExamen(wiskunde);

        String expected = "WiskundeExamenVragen.txt";

        String actual = daner.getGeslaagdeExamen().get(0).getNaam();

        assertEquals(expected, actual);
    }

    @Test
    void toonBehaaldeExamens() {
        Examen engels = new Examen("Resources/EngelsExamenVragen.txt");
        Examen wiskunde = new Examen("Resources/WiskundeExamenVragen.txt");

        Student daner = new Student("Daner");
        daner.addGeslaagdExamen(engels);
        daner.addGeslaagdExamen(wiskunde);

        String expected1 = "Engels";
        String expected2 = "Wiskunde";

        ArrayList<String> actual = new ArrayList<>();
        for (int i = 0; i < daner.getGeslaagdeExamen().size(); i++) {
            actual.add(daner.getGeslaagdeExamen().get(i).getNaam().substring(0, daner.getGeslaagdeExamen().get(i).getNaam().length()-16));
        }

        assertEquals(expected1, actual.get(0));
        assertEquals(expected2, actual.get(1));
    }

    @Test
    void toonStudent() {
        Student daner = new Student("Daner");

        String expected = "Daner, 10000001";

        String actual = daner.getNaam() + ", " + daner.getStudentenNummer();

        assertEquals(expected, actual);
    }

    @Test
    void zoekStudent() {
        Student daner = new Student("Daner");

        assertTrue(daner.testZoekStudent(10000001));
        assertFalse(daner.testZoekStudent(10000069));
    }

    @Test
    void toonMeestBehaaldeExamens() {
    }
}