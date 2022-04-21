package com.project;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class VraagTest {

    @Test
    void beantwoordVraag() { // test of het gegeven antwoord en het echte antwoord ook correct worden vergelijken
        Vraag vraag = new Vraag("2 + 2", "4");

        int expected = 1;

        InputStream inputStream = new ByteArrayInputStream("4".getBytes());
        System.setIn(inputStream);

        assertEquals(expected, vraag.beantwoordVraag());

    }
}