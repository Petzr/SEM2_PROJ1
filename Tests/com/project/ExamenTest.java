package com.project;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExamenTest {
    private ArrayList<Vraag> vragen = new ArrayList<>();
    private String naam;

    public String getNaam() {
        return naam;
    }

    public ArrayList<Vraag> getVragen() {
        return vragen;
    }

    public int getAantalVragen() {
        return vragen.size();
    }


    @Test
    public void toonExamenInfoTest() {
        // arrange
        Examen wiskunde = new Examen("Resources/WiskundeExamenVragen.txt");
        Examen engels = new Examen("Resources/EngelsExamenVragen.txt");

        String wiskundeResult = "Examen naam: WiskundeExamenVragen.txt, aantal vragen bij examen: 10";
        String engelsResult = "Examen naam: EngelsExamenVragen.txt, aantal vragen bij examen: 10";

        // act
        String WiskundeFormat = String.format("Examen naam: %s, aantal vragen bij examen: %d", wiskunde.getNaam(), wiskunde.getVragen().size());
        String engelsFormat = String.format("Examen naam: %s, aantal vragen bij examen: %d", engels.getNaam(), engels.getVragen().size());

        // assert
        assertTrue(wiskundeResult.equals(WiskundeFormat));
        assertTrue(engelsResult.equals(engelsFormat));


    }



    void examenAfnemen() {

 }

    @Test
    void isGeslaagdVoorExamenTest() { // ik(Peter) snap niet waarom je het zo lastig voor jezelf hebt gemaakt
        // arrange
        boolean expected1 = true;
        boolean expected2 = false;
        boolean actual1;
        boolean actual2;

        // act
        if (8 > 10 / 2) {
            System.out.println("Goed gedaan, je hebt het examen gehaald.");
            actual1 = true;
        } else {
            System.out.println("Helaas, je hebt het examen niet gehaald.");
            actual2 = false;
        }

        if (4 > 10 / 2) {
            System.out.println("Goed gedaan, je hebt het examen gehaald.");
            actual1 = true;
        } else {
            System.out.println("Helaas, je hebt het examen niet gehaald.");
            actual2 = false;

        }

        // act
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }
}