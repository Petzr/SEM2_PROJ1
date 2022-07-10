package com.project;

import java.util.Arrays;
import java.util.List;

public class MQC extends Vraag {
    List Antwoorden;

    public MQC(String vraag, String antwoord, List Antwoorden) {
        super(vraag, antwoord);
        this.Antwoorden = Antwoorden;
    }

    @Override
    public void stelVraag() {
        //doormiddel van lijst print je alle mogelijke antwoorden.
        List letters = Arrays.asList("A","B","C","D");

        System.out.println(this.vraag);


        int count = 0;
        for(Object optie : Antwoorden){
            System.out.println(letters.get(count++) + ". " + optie);
        }
    }




}

