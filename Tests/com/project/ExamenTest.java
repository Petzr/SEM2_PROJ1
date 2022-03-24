package com.project;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExamenTest {

    Examen engels = new Examen("Resources/EngelsExamenVragen.txt");

    @Test
    void getNaam() {
        String expectedResult = "EngelsExamenVragen.txt";
        String actualResult = engels.getNaam();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getVragen() {
        ArrayList<Vraag> expectedResult = new ArrayList<>();
        ArrayList<Vraag> actualResult = engels.getVragen();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getAantalVragen() {
        int expectedResult = 10;
        int actualResult = engels.getAantalVragen();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void examenAfnemen() {
    }

    @Test
    void isGeslaagdVoorExamen() {
        boolean expectedResult = true;
        boolean actualResult = engels.isGeslaagdVoorExamen(10);

        assertEquals(expectedResult, actualResult);

        actualResult = engels.isGeslaagdVoorExamen(6);
        assertEquals(expectedResult, actualResult);

        expectedResult = false;
        actualResult = engels.isGeslaagdVoorExamen(5);
        assertEquals(expectedResult, actualResult);
    }
}