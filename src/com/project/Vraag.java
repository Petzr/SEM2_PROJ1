package com.project;

import java.util.Scanner;

public class Vraag {
    private String vraag;
    private String antwoord;

    public Vraag(String vraag, String antwoord) {
        this.vraag = vraag;
        this.antwoord = antwoord;
    }

    public String getVraag() {
        return vraag;
    }
    public String getAntwoord() {
        return antwoord;
    }

    public int beantwoordVraag() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getVraag());

        String antwoord = scanner.nextLine();
        if (antwoord.equals(getAntwoord())) {
            System.out.println("Goed, het antwoord is "+ getAntwoord());
            return 1;
        }
        else {
            System.out.println("Fout, het antwoord is "+ getAntwoord());
            return 0;
        }
    }

}

