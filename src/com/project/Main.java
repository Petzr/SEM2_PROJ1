package com.project;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        ArrayList<Vraag> VragenLijst = new ArrayList<>();

        VragenLijst.add(new Vraag(" Wat is hoofdstad van Suriname?", "Paramaribo"));
        VragenLijst.add(new MQC("Waar ligt de hoofdstad van Nederland?","d", Arrays.asList("Noord-Holland","Groningen","Noord-Brabant","Zuid-Holland")));
        VragenLijst.add(new Vraag("In welk continent ligt Nederland?","Europa"));
        VragenLijst.add(new MQC("Waar ligt de Sahara?","a",Arrays.asList("Afrika","Azië","Atlantis","Azerbaijan")));
        VragenLijst.add(new Vraag("Is Azië de grootste werelddeel?","ja"));
        VragenLijst.add(new MQC("Waar ligt het Amazone gebied ?","b",Arrays.asList("Neverland","Brazilië,India,Australië")));
        VragenLijst.add(new Vraag("Welk land in Europa lijkt op een laars?","Italië"));
        VragenLijst.add(new MQC("In welk continent ligt Egypte?","d",Arrays.asList("Europa","Zuid-Amerika","Azië","Afrika")));
        VragenLijst.add(new Vraag("Welke land grenst aan de linkerkant van Spanje?","Portugal"));
        VragenLijst.add(new MQC("Welke Oceaan is de grootste ?","c",Arrays.asList("Atlantische Oceaan","Indische Oceaan","Grote Oceaan,Antartica Oceaan")));


        VragenLijst.get(VragenLijst.size()-1).beantwoordVraag();

    }


}
