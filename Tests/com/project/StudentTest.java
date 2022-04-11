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
        // arrange
        String expected1 = "Engels";
        String expected2 = "Wiskunde";

        // act
        Examen engels = new Examen("Resources/EngelsExamenVragen.txt");
        Examen wiskunde = new Examen("Resources/WiskundeExamenVragen.txt");

        Student daner = new Student("Daner");
        daner.addGeslaagdExamen(engels);
        daner.addGeslaagdExamen(wiskunde);


        ArrayList<String> actual = new ArrayList<>();
        for (int i = 0; i < daner.getGeslaagdeExamen().size(); i++)
        {
            actual.add(daner.getGeslaagdeExamen().get(i).getNaam().substring(0, daner.getGeslaagdeExamen().get(i).getNaam().length() - 16));
        }

        // assert
        assertEquals(expected1, actual.get(0));
        assertEquals(expected2, actual.get(1));
    }

    @Test
    void zoekStudent()
    {
        Student daner = new Student("Daner");

        int nummer = 10000001;
        InputStream in = new ByteArrayInputStream("ja".getBytes());
        System.setIn(in);

        assertTrue(daner.zoekStudent(nummer));
    }
}