package com.project;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExamenTest {
    private ArrayList<Vraag> vragen = new ArrayList<>();
    public int getAantalVragen() {
        return vragen.size();
    }
    @Test
    void examenAfnemen() {

    }

    @Test
    boolean isGeslaagdVoorExamen(int punten) {
        boolean expected1 = true;
        boolean expected2 = false;
        boolean actual1;
        boolean actual2;

        if (8 > 10 /2) {
            System.out.println("Goed gedaan, je hebt het examen gehaald.");
            actual1 = true;
        } else {
            System.out.println("Helaas, je hebt het examen niet gehaald.");
            actual2 = false;

            if (4 > 10 /2) {
                System.out.println("Goed gedaan, je hebt het examen gehaald.");
                actual1 = true;
            } else {
                System.out.println("Helaas, je hebt het examen niet gehaald.");
                actual2 = false;

        }
            assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);

    }

    @Test
    void toonExamenInfo() {
    }
}