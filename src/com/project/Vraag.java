package com.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Vraag {
    protected String vraag;
    protected String antwoord;

    public Vraag(String vraag, String antwoord) {
        this.vraag = vraag;
        this.antwoord = antwoord;
    }


    public String getAntwoord() {
        return antwoord;
    }

    public int beantwoordVraag() {
        Scanner scanner = new Scanner(System.in);
        stelVraag();
        System.out.println("\n");

        String antwoord = scanner.nextLine();
        if (antwoord.equalsIgnoreCase(getAntwoord())) {
            System.out.println("Goed, het antwoord is " + getAntwoord());
            return 1;
        } else {
            System.out.println("Fout, het antwoord is " + getAntwoord());
            return 0;
        }
    }

    public void stelVraag() {
        System.out.println(this.vraag);
    }

}

class MQC extends Vraag {
    List Antwoorden;

    public MQC(String vraag, String antwoord, List Antwoorden) {
        super(vraag, antwoord);
        this.Antwoorden = Antwoorden;
    }

    @Override
    public void stelVraag() {
        List letters = Arrays.asList("A","B","C","D");

        System.out.println(this.vraag);

        int count = 0;
         for(Object optie : Antwoorden){
             System.out.println(letters.get(count++) + ". " + optie);
         }
    }


}
