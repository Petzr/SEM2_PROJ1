package com.project;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExamenTest {

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

    @Test
    void isGeslaagdVoorExamenTest() {
        // arrange
        Examen engels = new Examen("Resources/EngelsExamenVragen.txt");
        // act
        boolean actual = engels.isGeslaagdVoorExamen(8);

        // act
        assertTrue(actual);
    }
}