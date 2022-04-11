package com.project;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest
{

    @Test
    void addGeslaagdExamen()
    {
        Examen wiskunde = new Examen("Resources/WiskundeExamenVragen.txt");
        Student daner = new Student("Daner");
        daner.addGeslaagdExamen(wiskunde);

        String expected = "WiskundeExamenVragen.txt";

        String actual = daner.getGeslaagdeExamen().get(0).getNaam();

        assertEquals(expected, actual);
    }

    @Test
    void toonBehaaldeExamens()
    {
        Examen engels = new Examen("Resources/EngelsExamenVragen.txt");
        Examen wiskunde = new Examen("Resources/WiskundeExamenVragen.txt");

        Student daner = new Student("Daner");
        daner.addGeslaagdExamen(engels);
        daner.addGeslaagdExamen(wiskunde);

        String expected1 = "Engels";
        String expected2 = "Wiskunde";

        ArrayList<String> actual = new ArrayList<>();
        for (int i = 0; i < daner.getGeslaagdeExamen().size(); i++)
        {
            actual.add(daner.getGeslaagdeExamen().get(i).getNaam().substring(0, daner.getGeslaagdeExamen().get(i).getNaam().length() - 16));
        }

        assertEquals(expected1, actual.get(0));
        assertEquals(expected2, actual.get(1));
    }

    @Test
    void zoekStudent()
    {
        Student daner = new Student("Daner");

        int nummer = 10000001;
        InputStream in = new ByteArrayInputStream("nee".getBytes());
        System.setIn(in);

        assertTrue(daner.zoekStudent(nummer));
    }
}