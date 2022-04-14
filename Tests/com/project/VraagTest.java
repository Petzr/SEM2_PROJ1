package com.project;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class VraagTest {

    @Test
    void beantwoordVraag() {
        Vraag vraag = new Vraag("Wat is de achternaam van Mario?", "Mario");

        String antwoordGoed = "Mario";  // dit is input
        String antwoordFout = "Bowser"; // dit is input

        boolean actualGoed;
        boolean actualFout;

        if (antwoordGoed.equals(vraag.getAntwoord())) {
            actualGoed = true;
        }
        else {
            actualGoed = false;
        }

        if (antwoordFout.equals(vraag.getAntwoord())) {
            actualFout = true;
        }
        else {
            actualFout = false;
        }

        assertTrue(actualGoed);
        assertEquals(actualFout, false);
    }

    @Test
    void beantwoordVraagP() {
        Vraag vraag = new Vraag("2 + 2", "4");

        int expected = 1;

        InputStream inputStream = new ByteArrayInputStream("4".getBytes());
        System.setIn(inputStream);

        assertEquals(expected, vraag.beantwoordVraag());

    }
}