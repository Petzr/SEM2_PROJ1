package com.project;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class VraagTest {

    @Test
    void beantwoordVraag() {
        Vraag vraag = new Vraag("2 + 2", "4");

        int expected = 1;

        InputStream inputStream = new ByteArrayInputStream("4".getBytes());
        System.setIn(inputStream);

        assertEquals(expected, vraag.beantwoordVraag());

    }
}